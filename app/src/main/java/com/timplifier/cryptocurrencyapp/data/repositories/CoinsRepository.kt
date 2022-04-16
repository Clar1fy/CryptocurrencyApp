package com.timplifier.cryptocurrencyapp.data.repositories

import com.timplifier.cryptocurrencyapp.base.BaseRepository
import com.timplifier.cryptocurrencyapp.data.local.room.daos.CoinDao
import com.timplifier.cryptocurrencyapp.data.remote.apiservices.CryptocurrencyApiService
import javax.inject.Inject

class CoinsRepository @Inject constructor(
    private val cryptocurrencyApiService: CryptocurrencyApiService,
    private val coinDao: CoinDao
) : BaseRepository() {

    fun fetchCoins() = sendRequest(
        { cryptocurrencyApiService.fetchCryptocurrency() },
        { coins -> coinDao.insertCoin(*coins.toTypedArray()) }
    )


    fun fetchSingleCoin(id: String) = sendRequest {
        cryptocurrencyApiService.fetchSingleCryptocurrency(id)
    }

    fun getCoins() = sendRequest {
        coinDao.getCoins()
    }


}