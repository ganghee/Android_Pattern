package com.example.myrepositorypattern.data.repository

import com.example.myrepositorypattern.network.MarketResponse
import com.example.myrepositorypattern.network.UpbitApi
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 *  https://docs.upbit.com/v1.0.6/reference#%EC%8B%9C%EC%84%B8-%EC%A2%85%EB%AA%A9-%EC%A1%B0%ED%9A%8C
 **/
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