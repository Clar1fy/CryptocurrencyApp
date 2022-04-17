package com.timplifier.cryptocurrencyapp.data.repositories

import com.timplifier.cryptocurrencyapp.base.BaseRepository
import com.timplifier.cryptocurrencyapp.common.resource.Resource
import com.timplifier.cryptocurrencyapp.data.local.room.daos.CoinDao
import com.timplifier.cryptocurrencyapp.data.remote.apiservices.CryptocurrencyApiService
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(

    private val cryptocurrencyApiService: CryptocurrencyApiService,
    private val coinDao: CoinDao
) : BaseRepository(), CoinRepository {
    override suspend fun getCoins(): Flow<Resource<List<CoinEntity>>> = sendRequest(
        {
            cryptocurrencyApiService.fetchCryptocurrency()
        }, { coins -> coinDao.insertCoin(*coins.toTypedArray()) })

    override suspend fun getCoinById(id: String) = sendRequest {
        cryptocurrencyApiService.fetchSingleCryptocurrency(id)
    }

}