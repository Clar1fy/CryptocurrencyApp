package com.timplifier.cryptocurrencyapp.common.extensions

import android.widget.ImageView
import androidx.fragment.app.Fragment
import com.timplifier.cryptocurrencyapp.R
import com.timplifier.cryptocurrencyapp.presentation.ui.activity.MainActivity

fun Fragment.setToolbarTitle(name: String) {
    (activity as MainActivity).supportActionBar?.title = name
}

fun ImageView.setCoinStatus(status: Boolean?) {
    when (status) {
        true -> this.setImageResource(R.drawable.coin_active_status)
        false -> {
            this.setImageResource(R.drawable.coin_inactive_status)
        }
        else -> {
        }
    }
}