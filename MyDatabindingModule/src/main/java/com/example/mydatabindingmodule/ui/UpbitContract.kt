package com.example.mydatabindingmodule.ui

import com.example.mydatabindingmodule.data.FormatTickers

interface UpbitContract {
    interface View: BaseView<Presenter>{
        fun showUpbitTickerList(tickerList: List<FormatTickers>)
        fun showFailUpbitTickerList()
    }

    interface Presenter: BasePresenter{
        fun getTicker(firstMarket: String?)
    }
}