package com.timplifier.cryptocurrencyapp.data.mapper

import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import com.timplifier.cryptocurrencyapp.domain.model.Coin


fun CoinEntity.toCoin() =
    Coin(
        name = name,
        symbol = symbol,
        rank = rank,
        isNew = isNew, isActive = isActive,
        type = type
    )

fun Coin.toCoinEntity() = CoinEntity(

    name = name,
    symbol = symbol,
    rank = rank,
    isNew = isNew, isActive = isActive,
    type = type
)