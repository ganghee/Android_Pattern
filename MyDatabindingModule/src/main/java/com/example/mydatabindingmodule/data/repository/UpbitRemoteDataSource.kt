package com.example.mydatabindingmodule.data.repository

import com.example.mydatabindingmodule.network.MarketResponse
import com.example.mydatabindingmodule.network.TickerResponse
import com.example.mydatabindingmodule.network.UpbitApi
import com.google.gson.Gson
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object UpbitRemoteDataSource {
    private val retrofit: UpbitApi = Retrofit.Builder()
        .baseUrl("https://api.upbit.com/v1/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UpbitApi::class.java)

     fun getMarketResponse(): Single<List<MarketResponse>> =
        retrofit.getMarket()
            .subscribeOn(Schedulers.io())

     fun getTickerResponse(markets: String): Single<List<TickerResponse>> =
        retrofit.getTicker(markets)
            .subscribeOn(Schedulers.io())

}