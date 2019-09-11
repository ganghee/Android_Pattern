package com.example.myrepositorypattern.adapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.myrepositorypattern.data.FormatTickers
import kotlinx.android.synthetic.main.rv_item_list.view.*

class UpbitHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
    private val tvCoinName = itemView.tv_coin_name
    private val tvTradePrice = itemView.tv_trade_price
    private val tvSignedChangeRate = itemView.tv_signed_change_rate
    private val tvAccTradePrice24h = itemView.tv_acc_trade_price_24h

    fun bind(ticker: FormatTickers){
        tvCoinName.text = ticker.toMarket
        tvTradePrice.text = ticker.toTradePrice
        tvSignedChangeRate.text = ticker.toSignedChangeRate
        tvAccTradePrice24h.text = ticker.toAccTradePrice24h
        tvSignedChangeRate.setTextColor(
            ContextCompat.getColor(itemView.context, ticker.toRateColor)
        )
    }
}