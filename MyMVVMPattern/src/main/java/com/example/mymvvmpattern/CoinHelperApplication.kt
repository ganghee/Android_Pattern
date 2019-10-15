package com.example.mymvvmpattern

import android.app.Application
import com.example.mymvvmpattern.di.dataSourceModule
import com.example.mymvvmpattern.di.getRemoteServiceModules
import com.example.mymvvmpattern.di.repositoryModule
import com.example.mymvvmpattern.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class CoinHelperApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidLogger()
            androidContext(this@CoinHelperApplication)
            modules(
                listOf(
                    viewModelModule,
                    repositoryModule,
                    dataSourceModule,
                    getRemoteServiceModules("https://api.upbit.com/v1/")
                )
            )
        }
    }
}