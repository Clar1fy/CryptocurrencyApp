package com.timplifier.cryptocurrencyapp.presentation.ui.fragments

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.base.BaseFragment
import com.timplifier.cryptocurrencyapp.common.extensions.submitData
import com.timplifier.cryptocurrencyapp.databinding.FragmentCoinListBinding
import com.timplifier.cryptocurrencyapp.presentation.ui.adapters.CoinsAdapter
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CoinListFragment :
    BaseFragment<FragmentCoinListBinding, CoinListViewModel>(R.layout.fragment_coin_list) {
    override val binding by viewBinding(FragmentCoinListBinding::bind)
    override val viewModel: CoinListViewModel by viewModels()
    private val coinsAdapter = CoinsAdapter(this::onItemClick)

    override fun setupViews() {
        setupAdapter()
    }

    private fun setupAdapter() {
        val linearLayoutManager = LinearLayoutManager(context)
        binding.recyclerview.apply {

            adapter = coinsAdapter
            layoutManager = linearLayoutManager
        }

    }


    override fun setupObserver() {
        subscribeToCoins()
    }

    private fun subscribeToCoins() {
        lifecycleScope.launch {
            viewModel.coinsState.observe(viewLifecycleOwner) {
                coinsAdapter.submitData(it)
            }
        }
    }

    override fun setupRequest() {
        viewModel.fetchCoins()
    }

    private fun onItemClick(id: String) {
        findNavController().navigate(
            CoinListFragmentDirections.actionCoinListFragmentToCoinDetailsFragment(
                id
            )
        )
    }
}
