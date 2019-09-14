package com.example.mydatabindingmodule.adapter

import android.view.View
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import com.example.mydatabindingmodule.data.FormatTickers
import com.example.mydatabindingmodule.databinding.RvItemListBinding

class UpbitHolder(private val binding: RvItemListBinding) : RecyclerView.ViewHolder(binding.root) {

    private var rvBinding: RvItemListBinding = binding

    fun bind(item: FormatTickers) {
        rvBinding.item = item

    }

}