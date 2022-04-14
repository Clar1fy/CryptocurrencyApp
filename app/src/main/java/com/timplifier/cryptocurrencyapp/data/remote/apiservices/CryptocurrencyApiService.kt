package com.timplifier.cryptocurrencyapp.data.remote.apiservices

import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptocurrencyApiService {
    @GET("v1/coins")
    suspend fun fetchCryptocurrency(): List<CryptocurrencyDto>

    @GET("v1/coins/{coin_id}")
    suspend fun fetchSingleCryptocurrency(@Path("coin_id") id: String): CryptocurrencyDto
}