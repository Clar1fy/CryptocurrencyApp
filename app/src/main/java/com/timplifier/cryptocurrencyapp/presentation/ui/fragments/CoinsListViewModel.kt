package com.timplifier.cryptocurrencyapp.presentation.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import com.timplifier.cryptocurrencyapp.domain.useCases.getCoins.GetCoinsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinsListViewModel @Inject constructor(
    private val getCoinsUseCase: GetCoinsUseCase
) : ViewModel() {
    private val _coinsState = MutableLiveData<List<CoinEntity>>()
    var coinsState: LiveData<List<CoinEntity>> = _coinsState


    fun getCoins() =

}