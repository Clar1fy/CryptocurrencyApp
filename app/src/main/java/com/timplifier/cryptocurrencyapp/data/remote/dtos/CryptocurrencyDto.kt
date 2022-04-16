package com.timplifier.cryptocurrencyapp.data.remote.dtos


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.timplifier.cryptocurrencyapp.base.BaseDiffModel

@Entity
data class CryptocurrencyDto(
    @PrimaryKey(autoGenerate = false)
    @SerializedName("id")
    override val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("type")
    val type: String
) : BaseDiffModel