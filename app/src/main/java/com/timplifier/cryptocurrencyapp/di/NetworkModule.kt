package com.timplifier.cryptocurrencyapp.di

import com.timplifier.cryptocurrencyapp.data.remote.RetrofitClient
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Singleton
    private val retrofitClient = RetrofitClient()


}