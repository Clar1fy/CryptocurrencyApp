package com.timplifier.cryptocurrencyapp.domain.useCases.getCoins

import com.timplifier.cryptocurrencyapp.base.BaseUseCase
import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) : BaseUseCase() {


    operator fun invoke() = invoke {
        val coins = coinRepository.getCoins().map { it.toCoin() }
    }
}