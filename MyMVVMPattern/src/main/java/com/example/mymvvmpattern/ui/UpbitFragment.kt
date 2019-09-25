package com.example.mymvvmpattern.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import com.example.mymvvmpattern.BR
import com.example.mymvvmpattern.R
import com.example.mymvvmpattern.base.BaseFragment
import com.example.mymvvmpattern.base.BaseRecyclerViewAdapter
import com.example.mymvvmpattern.data.FormatTickers
import com.example.mymvvmpattern.data.UpbitRepository
import com.example.mymvvmpattern.data.remote.UpbitRemoteDataSource
import com.example.mymvvmpattern.databinding.FragmentUpbitBinding
import com.example.mymvvmpattern.databinding.RvItemListBinding
import com.example.mymvvmpattern.viewmodel.UpbitViewModel

class UpbitFragment : BaseFragment<FragmentUpbitBinding>(R.layout.fragment_upbit) {

    private val upbitViewModel by lazy {
        UpbitViewModel(
            UpbitRepository.getInstance(UpbitRemoteDataSource)
        )
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val firstMarket = arguments?.getString(MARKET_NAME)

        initViewModel()
        upbitViewModel.getTicker(firstMarket)
    }

    private fun initViewModel() {
        binding.run {
            vm = upbitViewModel
            rvTickers.adapter =
                object : BaseRecyclerViewAdapter<FormatTickers, RvItemListBinding>(
                    layoutRes = R.layout.rv_item_list,
                    bindingVariableId = BR.item
                ) {}
        }
    }

    companion object {
        const val MARKET_NAME = "market name"
        fun newInstance(marketName: String): UpbitFragment {
            val fragment = UpbitFragment()
            val bundle = Bundle()

            bundle.putString(MARKET_NAME, marketName)
            Log.d("market3", "" + marketName)
            fragment.arguments = bundle
            return fragment
        }
    }
}
