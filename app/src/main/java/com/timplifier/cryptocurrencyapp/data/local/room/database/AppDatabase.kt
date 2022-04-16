package com.timplifier.cryptocurrencyapp.data.local.room.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.timplifier.cryptocurrencyapp.data.local.room.daos.CoinDao
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto

@Database(entities = [CryptocurrencyDto::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    abstract fun coinDao(): CoinDao

}