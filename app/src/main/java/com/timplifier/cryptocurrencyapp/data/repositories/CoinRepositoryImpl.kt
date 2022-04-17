package com.timplifier.cryptocurrencyapp.data.repositories

import com.timplifier.cryptocurrencyapp.data.remote.apiservices.CryptocurrencyApiService
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinDetailEntity
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(

    private val cryptocurrencyApiService: CryptocurrencyApiService
) : CoinRepository {
    override suspend fun getCoins(): List<CoinEntity> {
        return cryptocurrencyApiService.fetchCryptocurrency()
    }


    override suspend fun getCoinById(id: String): CoinDetailEntity {
        return cryptocurrencyApiService.fetchSingleCryptocurrency(id)
    }


}