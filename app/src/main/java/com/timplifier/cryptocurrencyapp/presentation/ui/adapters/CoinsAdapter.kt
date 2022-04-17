package com.timplifier.cryptocurrencyapp.presentation.ui.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.timplifier.cryptocurrencyapp.base.BaseDiffUtil
import com.timplifier.cryptocurrencyapp.common.extensions.setCoinStatus
import com.timplifier.cryptocurrencyapp.data.remote.dtos.CoinEntity
import com.timplifier.cryptocurrencyapp.databinding.ItemCoinsBinding

class CoinsAdapter(
    private val onItemClick: (id: String, name: String) -> Unit
) :
    ListAdapter<CoinEntity, CoinsAdapter.CoinsViewHolder>(
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
        fun onBind(entity: CoinEntity) {

            binding.apply {
                tvCoinRank.text = "($entity.rank)"
                tvCoinName.text = entity.name
                tvCoinRank.text = entity.symbol

                tvCoinStatus.setCoinStatus(entity.isActive)
                root.setOnClickListener {
                    onItemClick(entity.id, entity.name)
                }
            }

        }

    }


//    companion object : DiffUtil.ItemCallback<CoinEntity>() {
//        override fun areItemsTheSame(
//            oldItem: CoinEntity,
//            newItem: CoinEntity
//        ) =
//            oldItem.id == newItem.id
//
//
//        override fun areContentsTheSame(
//            oldItem: CoinEntity,
//            newItem: CoinEntity
//        ) =
//            oldItem == newItem
//
//
//    }
}