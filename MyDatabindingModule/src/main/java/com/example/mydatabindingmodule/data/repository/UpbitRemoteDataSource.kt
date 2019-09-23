package com.example.mydatabindingmodule.data.repository

import com.example.mydatabindingmodule.network.MarketResponse
import com.example.mydatabindingmodule.network.TickerResponse
import com.example.mydatabindingmodule.network.UpbitRemoteDataSource
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

object UpbitRemoteDataSourceImpl : UpbitRemoteDataSource{
    private val retrofit: UpbitRemoteDataSource = Retrofit.Builder()
        .baseUrl("https://api.upbit.com/v1/")
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(UpbitRemoteDataSource::class.java)

     override fun getMarket(): Single<List<MarketResponse>> =
        retrofit.getMarket()
            .subscribeOn(Schedulers.io())

     override fun getTicker(markets: String): Single<List<TickerResponse>> =
        retrofit.getTicker(markets)
            .subscribeOn(Schedulers.io())

}