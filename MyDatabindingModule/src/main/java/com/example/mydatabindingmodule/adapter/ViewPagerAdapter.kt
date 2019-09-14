package com.example.mydatabindingmodule.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import androidx.viewpager.widget.PagerAdapter
import com.example.mydatabindingmodule.ui.UpbitFragment

class ViewPagerAdapter(fm: FragmentManager, private val marketNum: Int) : FragmentStatePagerAdapter(
    fm,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    private val marketList = listOf(
        "KRW",
        "BTC",
        "ETH",
        "USDT"
    )

    override fun getItem(position: Int): Fragment = UpbitFragment.getInstance(marketList[position])

    override fun getCount(): Int = marketNum

}
