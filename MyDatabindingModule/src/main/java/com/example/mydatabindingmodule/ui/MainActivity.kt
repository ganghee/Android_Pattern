package com.example.mydatabindingmodule.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.mydatabindingmodule.R
import com.example.mydatabindingmodule.adapter.ViewPagerAdapter
import com.example.mydatabindingmodule.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        configureViewPager()
    }

    private fun configureViewPager() {
        binding.viewPagerMain.adapter = ViewPagerAdapter(supportFragmentManager, 4)

        with(binding.tabLayoutMain) {
            setupWithViewPager(binding.viewPagerMain)
            getTabAt(0)?.text = "KRW"
            getTabAt(1)?.text = "BTC"
            getTabAt(2)?.text = "ETH"
            getTabAt(3)?.text = "USDT"


        }
    }
}
