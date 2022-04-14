package com.timplifier.cryptocurrencyapp.data.repositories

import com.timplifier.cryptocurrencyapp.base.BaseRepository
import com.timplifier.cryptocurrencyapp.data.remote.apiservices.CryptocurrencyApiService
import javax.inject.Inject

class CoinsRepository @Inject constructor(
    private val cryptocurrencyApiService: CryptocurrencyApiService
) : BaseRepository() {

    fun fetchCoins() = sendRequest {
        cryptocurrencyApiService.fetchCryptocurrency()
    }

    fun fetchSingleCoin(id: String) = sendRequest {
        cryptocurrencyApiService.fetchSingleCryptocurrency(id)
    }

}