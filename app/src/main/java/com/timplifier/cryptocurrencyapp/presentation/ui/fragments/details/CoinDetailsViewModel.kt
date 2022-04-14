package com.timplifier.cryptocurrencyapp.presentation.ui.fragments.details

import com.timplifier.cryptocurrencyapp.base.BaseViewModel
import com.timplifier.cryptocurrencyapp.data.repositories.CoinsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CoinDetailsViewModel @Inject constructor(
    private val coinsRepository: CoinsRepository

) : BaseViewModel(


) {
    fun fetchASingleCoin(id: String) = coinsRepository.fetchSingleCoin(id)

}