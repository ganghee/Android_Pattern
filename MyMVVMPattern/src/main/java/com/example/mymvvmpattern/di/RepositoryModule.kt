package com.example.mymvvmpattern.di

import com.example.mymvvmpattern.data.UpbitRepository
import org.koin.dsl.module

val repositoryModule = module {
    single { UpbitRepository(get()) }
}