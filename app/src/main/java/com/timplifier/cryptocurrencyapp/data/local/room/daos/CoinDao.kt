package com.timplifier.cryptocurrencyapp.data.local.room.daos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto

@Dao
interface CoinDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCoin(vararg coins: CryptocurrencyDto)

    @Query("SELECT * FROM cryptocurrencydto")
    fun getCoins(): List<CryptocurrencyDto>
}