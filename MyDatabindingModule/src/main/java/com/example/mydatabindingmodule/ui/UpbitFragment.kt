package com.example.mydatabindingmodule.ui

import android.annotation.SuppressLint
import android.database.DatabaseUtils
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.example.mydatabindingmodule.R
import com.example.mydatabindingmodule.adapter.TickerAdapter
import com.example.mydatabindingmodule.data.FormatTickers
import com.example.mydatabindingmodule.data.UpbitRepository
import com.example.mydatabindingmodule.databinding.FragmentUpbitBinding
import org.jetbrains.anko.support.v4.toast

/**
 * A simple [Fragment] subclass.
 */
class UpbitFragment : Fragment(), UpbitContract.View {


    private lateinit var binding: FragmentUpbitBinding
    override lateinit var presenter: UpbitContract.Presenter

    private lateinit var tickerAdapter: TickerAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_upbit,
            container,
            false
        )
        return binding.root
    }

    @SuppressLint("CheckResult")
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val firstName = arguments?.getString(MARKET_NAME)

        configureRecyclerView()

        presenter =
            UpbitPresenter(
                UpbitRepository.getInstance(),
                this
            )
        presenter.getTicker(firstName)

    }

    private fun configureRecyclerView() {

        tickerAdapter = TickerAdapter()

        binding.rvTickers?.run {
            adapter = tickerAdapter
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        }

    }

    override fun showUpbitTickerList(tickerList: List<FormatTickers>) =
        tickerAdapter.setData(tickerList)


    override fun showFailUpbitTickerList() {
        toast("ticker 정보 가져오기 실패하였습니다.").show()
    }

    companion object {
        private const val MARKET_NAME = "market name"
        fun getInstance(market: String): UpbitFragment {
            val fragment = UpbitFragment()
            val bundle = Bundle()

            bundle.putString(MARKET_NAME, market)
            fragment.arguments = bundle

            return fragment

        }
    }
}
