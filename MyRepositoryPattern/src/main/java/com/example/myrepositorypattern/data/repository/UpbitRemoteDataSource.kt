package com.example.myrepositorypattern.data.repository

import android.util.Log
import com.example.myrepositorypattern.network.MarketResponse
import com.example.myrepositorypattern.network.UpbitApi
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object UpbitRemoteDataSource {
    private val retrofit: UpbitApi = Retrofit.Builder()
        .baseUrl("https://api.upbit.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(UpbitApi::class.java)

    fun getMarketResponse(): Single<List<MarketResponse>> =
        retrofit.getMarkets()
            .subscribeOn(Schedulers.io())

    fun getTickerResponse(marketList: String) =
        retrofit.getTickers(marketList)
            .subscribeOn(Schedulers.io())
}