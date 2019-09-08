package com.example.myrepositorypattern.data

import android.util.Log
import com.example.myrepositorypattern.data.repository.UpbitRemoteDataSource
import io.reactivex.Scheduler
import io.reactivex.Single
import io.reactivex.schedulers.Schedulers

/**
 * 가져온 데이터를 가공하는 클래스
 **/

class UpbitRepository {
    fun getMarkets(): Single<String> =
        UpbitRemoteDataSource.getMarketResponse()
            .map {
                it.joinToString(",") {
                    it.market
                }
            }

    fun getTicker(marketList: String) =
        UpbitRemoteDataSource.getTickerResponse(marketList)


//    companion object {
//        private var INSTANCE: UpbitRepository? = null
//
//        fun getInstance(): UpbitRepository = INSTANCE?.let { it } ?: UpbitRepository().apply {
//            INSTANCE = this
//        }
//    }
}