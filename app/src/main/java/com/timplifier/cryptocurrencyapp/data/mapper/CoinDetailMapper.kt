package com.timplifier.cryptocurrencyapp.data.mapper

import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinDetailEntity
import com.timplifier.cryptocurrencyapp.domain.model.CoinDetail


fun CoinDetailEntity.toCoinDetail() = CoinDetail(
    name = name,
    symbol = symbol,
    parent = parent,
    rank = rank,
    isNew = isNew,
    isActive = isActive,
    tags = tags,
    type = type,
    teamEntity = teamEntity,
    description = description,
    message = message,
    openSource = openSource,
    hardwareWallet = hardwareWallet,
    startedAt = startedAt,
    developmentStatus = developmentStatus,
    proofType = proofType,
    orgStructure = orgStructure,
    hashAlgorithm = hashAlgorithm,
    contract = contract,
    platform = platform,
    contracts = contracts,
    links = links,
    linksExtended = linksExtended,
    whitepaper = whitepaper,
    firstDataAt = firstDataAt,
    lastDataAt = lastDataAt


)

fun CoinDetail.toCoinEntity() = CoinDetailEntity(
    name = name,
    symbol = symbol,
    parent = parent,
    rank = rank,
    isNew = isNew,
    isActive = isActive,
    tags = tags,
    type = type,
    teamEntity = teamEntity,
    description = description,
    message = message,
    openSource = openSource,
    hardwareWallet = hardwareWallet,
    startedAt = startedAt,
    developmentStatus = developmentStatus,
    proofType = proofType,
    orgStructure = orgStructure,
    hashAlgorithm = hashAlgorithm,
    contract = contract,
    platform = platform,
    contracts = contracts,
    links = links,
    linksExtended = linksExtended,
    whitepaper = whitepaper,
    firstDataAt = firstDataAt,
    lastDataAt = lastDataAt

)