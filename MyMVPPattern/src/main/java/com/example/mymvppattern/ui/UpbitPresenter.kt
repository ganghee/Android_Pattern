package com.example.mymvppattern.ui

import android.annotation.SuppressLint
import android.util.Log
import com.example.mymvppattern.data.UpbitRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UpbitPresenter(
    private val repository: UpbitRepository,
    private val tickerView: UpbitContract.View
) :
    UpbitContract.Presenter {
    @SuppressLint("CheckResult")
    override fun getTicker(firstMarket: String?) {
        repository.getMarkets()
            .observeOn(Schedulers.newThread())
            .subscribe({ it ->
                repository.getTickers(it)
                    .observeOn(AndroidSchedulers.mainThread())
                    .map {
                        it.filter { it ->
                            it.market.split("-")[0] == firstMarket
                        }
                    }
                    .subscribe({
                        tickerView.showUpbitTickerList(it.map { it.toTicker() })
                    },
                        {
                            tickerView.showFailedUpbitTickerList()
                        })
            }, { Log.d("market_err", "" + it.message) })
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}