package com.timplifier.cryptocurrencyapp.data.local.room

import android.content.Context
import androidx.room.Room
import com.timplifier.cryptocurrencyapp.data.local.room.database.AppDatabase

class RoomClient {
    fun provideRoomDatabase(context: Context): AppDatabase =
        Room.databaseBuilder(context, AppDatabase::class.java, "database")
            .fallbackToDestructiveMigration().allowMainThreadQueries().build()


    fun provideCoinDao(appDatabase: AppDatabase) = appDatabase.coinDao()
}