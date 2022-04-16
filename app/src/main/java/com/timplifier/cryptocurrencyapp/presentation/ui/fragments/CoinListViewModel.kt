package com.timplifier.cryptocurrencyapp.presentation.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.timplifier.cryptocurrencyapp.base.BaseViewModel
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto
import com.timplifier.cryptocurrencyapp.data.repositories.CoinsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinListViewModel @Inject constructor(

    private val coinsRepository: CoinsRepository

) : BaseViewModel() {
    private var page: Int = 0
    var isLoading: Boolean = false

    private val _coinsState = MutableLiveData<List<CryptocurrencyDto>>()
    var coinsState: LiveData<List<CryptocurrencyDto>> = _coinsState

    fun fetchCoins() {
        isLoading = true
        coinsRepository.fetchCoins().gather(_coinsState) {
            page++
            isLoading = false
        }

    }

}