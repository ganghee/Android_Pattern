package com.example.mymvvmpattern.ui

import android.os.Bundle
import com.example.mymvvmpattern.R
import com.example.mymvvmpattern.adapter.ViewPagerAdapter
import com.example.mymvvmpattern.base.BaseActivity
import com.example.mymvvmpattern.databinding.ActivityMainBinding

class MainActivity : BaseActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewPagerAdapter by lazy { ViewPagerAdapter(supportFragmentManager) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.run {
            viewPager.adapter = viewPagerAdapter
            tabLayout.setupWithViewPager(binding.viewPager)
        }
    }
}