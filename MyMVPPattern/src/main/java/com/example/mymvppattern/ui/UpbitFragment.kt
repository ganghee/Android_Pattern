package com.example.mymvppattern.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymvppattern.R
import com.example.mymvppattern.adapter.TickerAdpater
import com.example.mymvppattern.data.FormatTickers
import com.example.mymvppattern.data.UpbitRepository
import kotlinx.android.synthetic.main.fragment_upbit.*
import org.jetbrains.anko.support.v4.toast

/**
 * A simple [Fragment] subclass.
 */
class UpbitFragment : Fragment(), UpbitContract.View {


    override lateinit var presenter: UpbitContract.Presenter
    private val tickerAdapter by lazy { TickerAdpater() }

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

        val firstMarket = arguments?.getString(MARKET)

        recyclerviewSetup()

        presenter =
            UpbitPresenter(
                UpbitRepository.getInstance(),
                this
            )
        presenter.getTicker(firstMarket)

    }

    private fun recyclerviewSetup() {

        rv_tickers.apply {
            adapter = tickerAdapter
            layoutManager = LinearLayoutManager(
                context, RecyclerView.VERTICAL, false
            )
        }
    }

    override fun showUpbitTickerList(tickerList: List<FormatTickers>) {
        tickerAdapter.setData(tickerList)
    }

    override fun showFailedUpbitTickerList() {
        toast("ticker 데이터를 가져올 수 없습니다.").show()
    }

    companion object {
        private const val MARKET = "market"

        fun newInstance(market: String): UpbitFragment {
            val bundle = Bundle()
            val fragment = UpbitFragment()

            bundle.putString(MARKET, market)
            fragment.arguments = bundle

            return fragment
        }
    }
}
