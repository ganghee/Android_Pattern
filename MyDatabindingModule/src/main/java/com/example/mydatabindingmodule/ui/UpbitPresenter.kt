package com.example.mydatabindingmodule.ui

import android.annotation.SuppressLint
import com.example.mydatabindingmodule.data.UpbitRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class UpbitPresenter(
    private val repository: UpbitRepository,
    private val tickerview: UpbitContract.View
) : UpbitContract.Presenter {
    @SuppressLint("CheckResult")
    override fun getTicker(firstMarket: String?) {
        repository.getMarket()
            .observeOn(Schedulers.newThread())
            .subscribe({
                repository.getTicker(it)
                    .map {
                        it.filter {
                            it.market.split("-")[0] == firstMarket
                        }
                    }
                    .observeOn(AndroidSchedulers.mainThread())
                    .subscribe({
                        tickerview.showUpbitTickerList(it.map { it.toTicker() })
                    }, {
                        tickerview.showFailUpbitTickerList()
                    })
            },
                {})
    }

    override fun start() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}