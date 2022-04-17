package com.timplifier.cryptocurrencyapp.data.remote.apiservices

import com.timplifier.cryptocurrencyapp.common.constants.Constants.GET_COINS_ENDPOINT
import com.timplifier.cryptocurrencyapp.common.constants.Constants.GET_SINGLE_COIN_ENDPOINT
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import retrofit2.http.GET
import retrofit2.http.Path

interface CryptocurrencyApiService {
    @GET(GET_COINS_ENDPOINT)
    suspend fun fetchCryptocurrency(): List<CoinEntity>

    @GET(GET_SINGLE_COIN_ENDPOINT)
    suspend fun fetchSingleCryptocurrency(@Path("coin_id") id: String): CoinEntity
}