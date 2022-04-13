package com.timplifier.cryptocurrencyapp.data.remote.apiservices

import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto
import retrofit2.http.GET

interface CryptocurrencyApiService {
    @GET("coins")
    suspend fun fetchCryptocurrency(): List<CryptocurrencyDto>
}