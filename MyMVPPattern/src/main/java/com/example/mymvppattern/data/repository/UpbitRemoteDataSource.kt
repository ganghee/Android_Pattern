package com.example.mymvppattern.data.repository

import com.example.mymvppattern.network.MarketResponse
import com.example.mymvppattern.network.TickerResponse
import com.example.mymvppattern.network.UpbitApi
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

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

    fun getTickerResponse(market: String): Single<List<TickerResponse>> =
        retrofit.getTicker(market)
            .subscribeOn(Schedulers.io())

}
