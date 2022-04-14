package com.timplifier.cryptocurrencyapp.presentation.ui.fragments.details

import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.base.BaseFragment
import com.timplifier.cryptocurrencyapp.common.extensions.setCoinStatus
import com.timplifier.cryptocurrencyapp.common.extensions.setToolbarTitle
import com.timplifier.cryptocurrencyapp.databinding.FragmentCoinDetailsBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


@AndroidEntryPoint
class CoinDetailsFragment :
    BaseFragment<FragmentCoinDetailsBinding, CoinDetailsViewModel>(R.layout.fragment_coin_details) {
    override val binding by viewBinding(FragmentCoinDetailsBinding::bind)
    override val viewModel: CoinDetailsViewModel by viewModels()
    private val args: CoinDetailsFragmentArgs by navArgs()

    override fun setupViews() {
        getArgs()
    }

    private fun getArgs() {
        setToolbarTitle(args.coinsName)
    }

    override fun setupObserver() {
        lifecycleScope.launch {
            viewModel.fetchASingleCoin(args.coinsId).collect {
                binding.apply {

                    tvCoinName.text = it.data?.name
                    tvCoinSymbol.text = it.data?.symbol
                    tvCoinRank.text = it.data?.rank.toString()
                    tvCoinStatus.setCoinStatus(it.data?.isActive)

                }
            }
        }
    }
}
