package com.timplifier.cryptocurrencyapp.presentation.ui.adapters

import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.cryptocurrencyapp.base.BaseDiffUtil
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto

class CoinAdapter : ListAdapter<CryptocurrencyDto, ListAdapter.CoinsViewHolder>(BaseDiffUtil()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.CoinsViewHolder {
    }

    override fun onBindViewHolder(holder: ListAdapter.CoinsViewHolder, position: Int) {
    }

    inner class CoinsViewHolder(private val binding: ItemCoinsBinding) : RecyclerView.ViewHolder

    companion object : DiffUtil.ItemCallback<CryptocurrencyDto>() {
        override fun areItemsTheSame(
            oldItem: CryptocurrencyDto,
            newItem: CryptocurrencyDto
        ) =
            oldItem.id == newItem.id


        override fun areContentsTheSame(
            oldItem: CryptocurrencyDto,
            newItem: CryptocurrencyDto
        ) =
            oldItem == newItem


    }
}