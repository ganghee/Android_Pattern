package com.example.mymvppattern.adapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mymvppattern.data.FormatTickers
import kotlinx.android.synthetic.main.rv_item_list.view.*

class UpbitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val tvMarketName = itemView.tv_coin_name
    private val tvAccTradePrice = itemView.tv_acc_trade_price_24h
    private val tvSignedChangeRate = itemView.tv_signed_change_rate
    private val tvTradePrice = itemView.tv_trade_price

    fun bind(item: FormatTickers) {
        tvMarketName.text = item.toMarket
        tvAccTradePrice.text = item.toTradePrice
        tvSignedChangeRate.text = item.toSignedChangeRate
        tvTradePrice.text = item.toTradePrice
        tvSignedChangeRate.setTextColor(ContextCompat.getColor(itemView.context, item.toRateColor))

    }
}