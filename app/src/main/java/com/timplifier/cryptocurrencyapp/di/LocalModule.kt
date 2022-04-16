package com.timplifier.cryptocurrencyapp.di

import android.content.Context
import com.timplifier.cryptocurrencyapp.data.local.room.RoomClient
import com.timplifier.cryptocurrencyapp.data.local.room.database.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object LocalModule {

    @Singleton
    private val roomClient = RoomClient()

    @Singleton
    @Provides
    fun provideRoomDatabase(@ApplicationContext context: Context) =
        roomClient.provideRoomDatabase(context)

    @Singleton
    @Provides
    fun provideCoinDao(appDatabase: AppDatabase) = roomClient.provideCoinDao(appDatabase)
}