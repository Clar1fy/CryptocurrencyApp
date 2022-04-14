package com.timplifier.cryptocurrencyapp.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.base.BaseDiffUtil
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CryptocurrencyDto
import com.timplifier.cryptocurrencyapp.databinding.ItemCoinsBinding

class CoinsAdapter(
    private val onItemClick: (name: String) -> Unit
) :
    ListAdapter<CryptocurrencyDto, CoinsAdapter.CoinsViewHolder>(
        BaseDiffUtil()
    ) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinsViewHolder {
        return CoinsViewHolder(
            ItemCoinsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: CoinsViewHolder, position: Int) {
        getItem(position)?.let { holder.onBind(it) }

    }

    inner class CoinsViewHolder(private val binding: ItemCoinsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(dto: CryptocurrencyDto) {

            binding.apply {
                tvCoinRank.text = "($dto.rank)"
                tvCoinName.text = dto.name
                tvCoinRank.text = dto.symbol

                when (dto.isActive) {
                    true -> tvCoinStatus.setImageResource(R.drawable.coin_active_status)
                    false -> tvCoinStatus.setImageResource(R.drawable.coin_inactive_status)
                }
                root.setOnClickListener {
                    onItemClick(dto.name)
                }
            }

        }

    }


//    companion object : DiffUtil.ItemCallback<CryptocurrencyDto>() {
//        override fun areItemsTheSame(
//            oldItem: CryptocurrencyDto,
//            newItem: CryptocurrencyDto
//        ) =
//            oldItem.id == newItem.id
//
//
//        override fun areContentsTheSame(
//            oldItem: CryptocurrencyDto,
//            newItem: CryptocurrencyDto
//        ) =
//            oldItem == newItem
//
//
//    }
}