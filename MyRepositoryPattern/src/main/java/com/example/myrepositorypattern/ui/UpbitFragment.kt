package com.example.myrepositorypattern.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myrepositorypattern.R
import com.example.myrepositorypattern.adapter.TickerAdapter
import com.example.myrepositorypattern.data.FormatTickers
import com.example.myrepositorypattern.data.UpbitRepository
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_upbit.*

/**
 * A simple [Fragment] subclass.
 */
@Suppress("UNREACHABLE_CODE")
class UpbitFragment : androidx.fragment.app.Fragment() {

    private lateinit var tickerAdapter: TickerAdapter
    private val repository by lazy { UpbitRepository() }
    private val tickerList by lazy { mutableListOf<FormatTickers>() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_upbit, container, false)
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val firstMarket = arguments?.getString(MARKET_NAME)

        recyclerViewSetup()


        repository.getMarkets()
            .observeOn(Schedulers.newThread())
            .subscribe({ it ->
                Log.d("getMarketSuccess", "okok")
                repository.getTicker(it)
                    .observeOn(AndroidSchedulers.mainThread())
                    .map {
                        it.filter { TickerResponse ->
                            TickerResponse.market.split("-")[0] == firstMarket
                        }
                    }
                    .subscribe({
                        Log.d("getTickerSuccess", "okok")
                        it.map {
                            tickerList.add(
                                it.toTicker()
                            )
                            tickerAdapter.setData(tickerList)
                        }
                    }, { it ->
                        Log.d("ticker_err", "" + it.message)
                    })
            }, { it ->
                Log.d("market_err", "" + it.message)
            })
    }

    private fun recyclerViewSetup() {
        tickerAdapter = TickerAdapter()
        rv_tickers?.run {
            adapter = tickerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
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
