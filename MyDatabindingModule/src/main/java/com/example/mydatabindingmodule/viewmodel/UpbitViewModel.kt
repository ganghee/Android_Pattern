package com.example.mydatabindingmodule.viewmodel

import android.annotation.SuppressLint
import android.content.Context
import android.util.Log
import android.widget.Toast
import androidx.core.content.ContextCompat
import androidx.databinding.BaseObservable
import androidx.databinding.ObservableField
import androidx.lifecycle.ViewModel
import com.example.mydatabindingmodule.adapter.TickerAdapter
import com.example.mydatabindingmodule.data.FormatTickers
import com.example.mydatabindingmodule.data.UpbitRepository
import com.google.android.material.internal.ContextUtils
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import org.jetbrains.anko.support.v4.toast

class MainViewModel(
    private val repository: UpbitRepository
) : ViewModel(){

    var tickerList = ObservableField<List<FormatTickers>>()
    private val tickerAdapter = ObservableField<TickerAdapter>()

    @SuppressLint("CheckResult")
    fun getTicker(firstMarket: String?) {

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
                        showUpbitTickerList(it
                            .map { it.toTicker() }
                        )
                    }, {
                        showFailUpbitTickerList()
                    })
            },
                {})
    }

    fun showUpbitTickerList(tickerList: List<FormatTickers>){
        tickerAdapter.set(TickerAdapter())
    }

    private fun showFailUpbitTickerList() {

    }
}