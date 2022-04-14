package com.timplifier.cryptocurrencyapp.presentation.ui.fragments.details

import androidx.fragment.app.viewModels
import androidx.navigation.fragment.navArgs
import by.kirich1409.viewbindingdelegate.viewBinding
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.base.BaseFragment
import com.timplifier.cryptocurrencyapp.common.extensions.setToolbarTitle
import com.timplifier.cryptocurrencyapp.databinding.FragmentCoinDetailsBinding
import com.timplifier.cryptocurrencyapp.presentation.ui.activity.MainActivity
import dagger.hilt.android.AndroidEntryPoint


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
}
