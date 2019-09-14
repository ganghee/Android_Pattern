package com.example.mydatabindingmodule.network

import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface UpbitApi {
    @GET("market/all")
    fun getMarket(): Single<List<MarketResponse>>

    @GET("ticker")
    fun getTicker(
        @Query("markets") markets: String
    ): Single<List<TickerResponse>>
}