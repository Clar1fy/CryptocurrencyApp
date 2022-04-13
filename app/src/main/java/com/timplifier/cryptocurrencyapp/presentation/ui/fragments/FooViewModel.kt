package com.timplifier.cryptocurrencyapp.presentation.ui.fragments

import android.app.Application
import android.content.Context
import com.timplifier.cryptocurrencyapp.base.BaseViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

@HiltViewModel
class FooViewModel @Inject constructor(
    @ApplicationContext private val context: Context
)  {
    companion object {

    }
}