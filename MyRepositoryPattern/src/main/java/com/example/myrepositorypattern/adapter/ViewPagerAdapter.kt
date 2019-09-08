package com.example.myrepositorypattern.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.myarchitecture.ui.UpbitFragment

class ViewPagerAdapter (fm: FragmentManager, private val fragment_num : Int):
        FragmentStatePagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val marketList = listOf("KRW", "BTC", "ETH", "USDT")

    override fun getItem(position: Int): Fragment = UpbitFragment.newInstance(marketList[position])

    override fun getCount(): Int = fragment_num
}