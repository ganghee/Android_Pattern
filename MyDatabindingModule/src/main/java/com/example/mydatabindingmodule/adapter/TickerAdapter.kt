package com.example.mydatabindingmodule.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mydatabindingmodule.R
import com.example.mydatabindingmodule.data.FormatTickers
import com.example.mydatabindingmodule.databinding.RvItemListBinding
import kotlinx.coroutines.channels.ticker
import java.util.zip.Inflater

class TickerAdapter : RecyclerView.Adapter<UpbitHolder>() {

    private val tickerList = mutableListOf<FormatTickers>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UpbitHolder =
        UpbitHolder(
            RvItemListBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun getItemCount(): Int = tickerList.size

    override fun onBindViewHolder(holder: UpbitHolder, position: Int) =
        holder.bind(tickerList[position])

    fun setData(setTickerList: List<FormatTickers>) {
        this.tickerList.clear()
        this.tickerList.addAll(setTickerList)
        notifyDataSetChanged()
    }

}
