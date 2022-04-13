package com.timplifier.cryptocurrencyapp.base

import com.timplifier.cryptocurrencyapp.common.resource.Resource
import kotlinx.coroutines.flow.flow
import okio.IOException

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
        } catch (e: IOException) {
            emit(
                Resource.Error(null, e.localizedMessage ?: "An error occurred ! ")

            )
        } ca


    }

    protected fun <T> sendRequest(request: suspend () -> T) = flow {

        emit(Resource.Loading())
        try {
            emit(Resource.Success(data = request()))
        } catch (e: IOException) {
            emit(
                Resource.Error(null, e.localizedMessage ?: "An error occurred!")
            )
        }
    }
}