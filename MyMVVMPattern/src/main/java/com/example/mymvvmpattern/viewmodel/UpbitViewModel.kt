package com.example.mymvvmpattern.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.mymvvmpattern.base.BaseViewModel
import com.example.mymvvmpattern.data.FormatTickers
import com.example.mymvvmpattern.data.UpbitRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers
import java.util.concurrent.TimeUnit

class UpbitViewModel(
    private val repository: UpbitRepository
) : BaseViewModel() {

    val tickerList = MutableLiveData<List<FormatTickers>>()

    fun getTicker(firstMarket: String?) {
        repository.getMarket()
            .observeOn(Schedulers.newThread())
            .subscribe({ it ->
                repository.getTicker(it)
                    .repeatWhen { it.delay(5, TimeUnit.SECONDS) }
                    .observeOn(AndroidSchedulers.mainThread())
                    .map {
                        it.filter { TickerResponse ->
                            TickerResponse.market.split("-")[0] == firstMarket
                        }
                    }
                    .subscribe({
                        tickerList.postValue(it.map { it.toTicker() })
                    }, {
                        showFailedUpbitTickerList()
                    })
            }, {
                Log.d("errorlog", "%%%" + it.printStackTrace())
            }).also { compositeDisposable.add(it) }
    }

    private fun showFailedUpbitTickerList() {
        Log.d("TickerFail", "Ticker is not show")
    }

}