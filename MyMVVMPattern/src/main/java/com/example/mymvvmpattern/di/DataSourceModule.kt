package com.example.mymvvmpattern.di

import com.example.mymvvmpattern.data.remote.UpbitRemoteDataSource
import org.koin.dsl.module

val dataSourceModule = module {
    single {
        UpbitRemoteDataSource(get())
    }
}