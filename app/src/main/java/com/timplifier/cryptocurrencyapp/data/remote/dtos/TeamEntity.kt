package com.timplifier.cryptocurrencyapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class TeamEntity(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("position")
    val position: String
)