package com.timplifier.cryptocurrencyapp.domain.useCases.getCoins

import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) {

}