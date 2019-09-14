package com.example.mymvppattern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import com.example.mymvppattern.R
import com.example.mymvppattern.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_upbit.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configurationViewPager()
    }

    private fun configurationViewPager() {
        viewPager_main.adapter = ViewPagerAdapter(supportFragmentManager,4)

        with(tabLayout_main){
            setupWithViewPager(viewPager_main)

            getTabAt(0)?.text = "KRW"
            getTabAt(1)?.text = "BTC"
            getTabAt(2)?.text = "ETH"
            getTabAt(3)?.text = "USDT"

        }
    }
}
