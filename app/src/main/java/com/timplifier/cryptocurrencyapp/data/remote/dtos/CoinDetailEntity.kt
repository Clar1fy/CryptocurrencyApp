package com.timplifier.cryptocurrencyapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class CoinDetailEntity(
    @SerializedName("id")
    val id: String? = null,
    @SerializedName("name")
    val name: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("parent")
    val parent: Parent,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("type")
    val type: String,
    @SerializedName("tags")
    val tags: List<Tag>,
    @SerializedName("teamEntity")
    val teamEntity: List<TeamEntity>,
    @SerializedName("description")
    val description: String,
    @SerializedName("message")
    val message: String,
    @SerializedName("open_source")
    val openSource: Boolean,
    @SerializedName("hardware_wallet")
    val hardwareWallet: Boolean,
    @SerializedName("started_at")
    val startedAt: String,
    @SerializedName("development_status")
    val developmentStatus: String,
    @SerializedName("proof_type")
    val proofType: String,
    @SerializedName("org_structure")
    val orgStructure: String,
    @SerializedName("hash_algorithm")
    val hashAlgorithm: String,
    @SerializedName("contract")
    val contract: String,
    @SerializedName("platform")
    val platform: String,
    @SerializedName("contracts")
    val contracts: List<Contract>,
    @SerializedName("links")
    val links: Links,
    @SerializedName("links_extended")
    val linksExtended: List<LinksExtended>,
    @SerializedName("whitepaper")
    val whitepaper: Whitepaper,
    @SerializedName("first_data_at")
    val firstDataAt: String,
    @SerializedName("last_data_at")
    val lastDataAt: String
)