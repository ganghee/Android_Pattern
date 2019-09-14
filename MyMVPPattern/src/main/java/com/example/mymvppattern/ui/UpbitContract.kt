package com.example.mymvppattern.ui

import com.example.mymvppattern.data.FormatTickers
import com.example.mymvppattern.util.FormatText

interface UpbitContract {
    interface View : BaseView<Presenter> {
        fun showUpbitTickerList(tickerList: List<FormatTickers>)
        fun showFailedUpbitTickerList()
    }

    interface Presenter : BasePresenter {
        fun getTicker(firstMarket: String?)
    }
}