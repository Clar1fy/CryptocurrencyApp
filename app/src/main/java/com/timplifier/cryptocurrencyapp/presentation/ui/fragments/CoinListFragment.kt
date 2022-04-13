package com.timplifier.cryptocurrencyapp.presentation.ui.fragments

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.base.BaseFragment
import com.timplifier.cryptocurrencyapp.databinding.FragmentCoinListBinding


class CoinListFragment :
    BaseFragment<FragmentCoinListBinding, CoinListViewModel>(R.layout.fragment_coin_list) {
    override val binding by viewBinding(FragmentCoinListBinding::bind)
    override val viewModel: CoinListViewModel by viewModels()

    override fun setupListeners() {
    }

    override fun setupObserver() {
    }

    override fun setupRequest() {
    }

}
