package com.example.mymvvmpattern.di

import com.example.mymvvmpattern.viewmodel.UpbitViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { UpbitViewModel(get()) }
}