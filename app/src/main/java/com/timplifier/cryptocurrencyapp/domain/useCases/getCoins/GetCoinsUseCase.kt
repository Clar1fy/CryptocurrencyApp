package com.timplifier.cryptocurrencyapp.domain.useCases.getCoins

import com.timplifier.cryptocurrencyapp.base.BaseUseCase
import com.timplifier.cryptocurrencyapp.domain.model.Coin
import com.timplifier.cryptocurrencyapp.domain.repositories.CoinRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetCoinsUseCase @Inject constructor(
    private val coinRepository: CoinRepository
) : BaseUseCase() {


    operator fun invoke() = invoke {
    }
}