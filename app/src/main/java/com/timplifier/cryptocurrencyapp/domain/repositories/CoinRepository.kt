package com.timplifier.cryptocurrencyapp.domain.repositories

import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinDetailEntity
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity

interface CoinRepository {

    suspend fun getCoins(): List<CoinEntity>
    suspend fun getCoinById(id: String): CoinDetailEntity

}