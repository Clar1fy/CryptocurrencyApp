package com.timplifier.cryptocurrencyapp.domain.model

import com.timplifier.cryptocurrencyapp.data.remote.dtos.*

data class CoinDetail(
    val name: String,
    val symbol: String,
    val parent: Parent,
    val rank: Int,
    val isNew: Boolean,
    val isActive: Boolean,
    val type: String,
    val tags: List<Tag>,
    val teamEntity: List<TeamEntity>,
    val description: String,
    val message: String,
    val openSource: Boolean,
    val hardwareWallet: Boolean,
    val startedAt: String,
    val developmentStatus: String,
    val proofType: String,
    val orgStructure: String,
    val hashAlgorithm: String,
    val contract: String,
    val platform: String,
    val contracts: List<Contract>,
    val links: Links,
    val linksExtended: List<LinksExtended>,
    val whitepaper: Whitepaper,
    val firstDataAt: String,
    val lastDataAt: String
)