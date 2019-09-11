package com.example.myrepositorypattern.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myrepositorypattern.R
import com.example.myrepositorypattern.adapter.ViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        configureMainTab()
    }

    private fun configureMainTab() {
        viewpager_main.adapter = ViewPagerAdapter(supportFragmentManager,4)

        with(tablayout_main){
            setupWithViewPager(viewpager_main)
            getTabAt(0)?.text = "KRW"
            getTabAt(1)?.text = "BTC"
            getTabAt(2)?.text = "ETH"
            getTabAt(3)?.text = "USDT"
        }
    }
}
