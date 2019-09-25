package com.example.mymvvmpattern.network

import com.example.mymvvmpattern.network.MarketResponse
import com.example.mymvvmpattern.network.TickerResponse
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query


interface UpbitService {

    @GET("market/all")
    fun getMarkets(): Single<List<MarketResponse>>

    @GET("ticker")
    fun getTickers(
        @Query("markets") markets: String
    ): Single<List<TickerResponse>>
}