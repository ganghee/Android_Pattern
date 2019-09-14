package com.example.mymvppattern.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mymvppattern.R
import com.example.mymvppattern.data.FormatTickers

class TickerAdpater : RecyclerView.Adapter<UpbitViewHolder>() {

    private val tickerList = mutableListOf<FormatTickers>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpbitViewHolder =
        UpbitViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.rv_item_list, parent, false)
        )

    override fun getItemCount(): Int = tickerList.size

    override fun onBindViewHolder(holder: UpbitViewHolder, position: Int) {
        holder.bind(tickerList[position])
    }

    fun setData(setTickerList: List<FormatTickers>) {
        this.tickerList.clear()
        this.tickerList.addAll(setTickerList)
        notifyDataSetChanged()
    }

}
