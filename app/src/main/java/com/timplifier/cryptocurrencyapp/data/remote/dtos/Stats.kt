package com.timplifier.cryptocurrencyapp.data.remote.dtos


import com.google.gson.annotations.SerializedName

data class Stats(
    @SerializedName("subscribers")
    val subscribers: Int,
    @SerializedName("contributors")
    val contributors: Int,
    @SerializedName("stars")
    val stars: Int
)