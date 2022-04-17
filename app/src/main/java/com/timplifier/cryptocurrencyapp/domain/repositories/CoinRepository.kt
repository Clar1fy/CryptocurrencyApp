package com.timplifier.cryptocurrencyapp.domain.repositories

import com.timplifier.cryptocurrencyapp.common.resource.Resource
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinDetailEntity
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import kotlinx.coroutines.flow.Flow

interface CoinRepository {

    suspend fun getCoins(): Flow<Resource<List<CoinEntity>>>
    suspend fun getCoinById(id: String): Flow<Resource<CoinDetailEntity>>

}