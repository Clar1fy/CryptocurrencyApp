package com.timplifier.cryptocurrencyapp.common.extensions

import androidx.fragment.app.Fragment
import com.timplifier.cryptocurrencyapp.presentation.ui.activity.MainActivity

fun Fragment.setToolbarTitle(name: String) {
    (activity as MainActivity).supportActionBar?.title = name
}