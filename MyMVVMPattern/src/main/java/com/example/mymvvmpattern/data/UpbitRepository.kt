package com.example.mymvvmpattern.data

import com.example.mymvvmpattern.data.remote.UpbitRemoteDataSource
import com.example.mymvvmpattern.data.remote.UpbitService
import io.reactivex.Single

/**
 * 가져온 데이터를 가공하는 클래스
 **/

class UpbitRepository(
    private val upbitRemoteDataSource: UpbitRemoteDataSource
) {
    fun getMarket(): Single<String> =
        upbitRemoteDataSource.getMarkets()
            .map {
                it.joinToString(",") {
                    it.market
                }
            }

    fun getTicker(marketList: String) =
        upbitRemoteDataSource.getTickers(marketList)

}