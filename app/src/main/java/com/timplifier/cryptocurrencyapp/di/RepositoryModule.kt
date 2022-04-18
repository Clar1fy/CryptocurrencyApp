package com.timplifier.cryptocurrencyapp.di

import com.timplifier.cryptocurrencyapp.data.repositories.CoinRepositoryImpl
import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindCoinRepository(coinRepositoryImpl: CoinRepositoryImpl): CoinRepository

}