package com.timplifier.cryptocurrencyapp.base

import com.timplifier.cryptocurrencyapp.common.resource.Resource
import kotlinx.coroutines.flow.flow
import okio.IOException
import retrofit2.HttpException

abstract class BaseRepository {

    protected fun <T> sendRequest(
        request: suspend () -> T,
        saveToDatabase: suspend (data: T) -> Unit
    ) = flow {
        emit(Resource.Loading())
        try {
            request()?.let {
                saveToDatabase(it)

                emit(Resource.Success(it))
            }
        } catch (ioException: IOException) {
            emit(
                Resource.Error(
                    null,
                    ioException.localizedMessage ?: "An IOException error occurred ! "
                )

            )
        } catch (httpException: HttpException) {
            emit(
                Resource.Error(
                    null,
                    httpException.localizedMessage ?: "An HttpException occurred!"
                )
            )
        }


    }

    protected fun <T> sendRequest(request: suspend () -> T) = flow {

        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = request()))
        } catch (e: IOException) {
            emit(
                Resource.Error(null, e.localizedMessage ?: "An error occurred!")
            )
        } catch (httpException: HttpException) {
            emit(
                Resource.Error(
                    null,
                    httpException.localizedMessage ?: "An HttpException occurred!"
                )
            )
        }
    }
}