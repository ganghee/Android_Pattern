package com.example.mymvppattern.data

import com.example.mymvppattern.data.repository.UpbitRemoteDataSource
import io.reactivex.Single

class UpbitRepository {
    fun getMarkets(): Single<String> =
        UpbitRemoteDataSource.getMarketResponse()
            .map {
                it.joinToString ( "," ){
                    it.market
                }
            }
    fun getTickers(marketList: String) =
        UpbitRemoteDataSource.getTickerResponse(marketList)

    companion object{
        private var INSTANCE: UpbitRepository?= null

        fun getInstance(): UpbitRepository = INSTANCE?.let { it } ?: UpbitRepository().apply {
            INSTANCE = this
        }
    }
}