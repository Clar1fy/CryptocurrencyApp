package com.timplifier.cryptocurrencyapp.domain.model

data class Coin(
    val name: String,
    val symbol: String,
    val rank: Int,
    val isNew: Boolean,
    val isActive: Boolean,
    val type: String
)
