package com.timplifier.cryptocurrencyapp.presentation.ui.fragments.details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.timplifier.cryptocurrencyapp.base.BaseViewModel
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto
import com.timplifier.cryptocurrencyapp.data.repositories.CoinsRepository
import dagger.hilt.android.lifecycle.HiltViewModel

@HiltViewModel
class CoinDetailsViewModel(
    private val coinsRepository: CoinsRepository

) : BaseViewModel(


) {

}