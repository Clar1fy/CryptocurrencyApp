package com.timplifier.cryptocurrencyapp.base

import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.common.resource.Resource
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException

abstract class BaseUseCase {

    protected fun <T> invoke(
        request: suspend () -> T,
        transform: (T) -> R
    ) = flow {

        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
            transform(request())

        } catch (io: IOException) {
            emit(
                Resource.Error(
                    data = null, io.localizedMessage ?: "An IOException occurred!"
                )
            )
        } catch (httpException: HttpException) {
            emit(
                Resource.Error(
                    data = null,
                    httpException.localizedMessage ?: "An HttpException occurred!"
                )
            )
        }
    }
}