package com.example.mydatabindingmodule.data

import com.example.mydatabindingmodule.data.repository.UpbitRemoteDataSource
import io.reactivex.Single

class UpbitRepository {
    fun getMarket(): Single<String> =
        UpbitRemoteDataSource.getMarketResponse()
            .map {
                it.joinToString(",") {
                     it.market
                }
            }

    fun getTicker(market: String) =
        UpbitRemoteDataSource.getTickerResponse(market)

    companion object{
        private var INSTANCE : UpbitRepository? = null
        fun getInstance() : UpbitRepository = INSTANCE?.let { it } ?: UpbitRepository().apply {
            INSTANCE = this
        }
    }
}