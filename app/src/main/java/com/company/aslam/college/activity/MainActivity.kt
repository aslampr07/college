package com.company.aslam.college.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.widget.Toolbar
import com.company.aslam.college.R
import com.company.aslam.college.adapter.HomeBannerViewPagerAdapter

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainToolbar = findViewById<Toolbar>(R.id.Home_ActionBar)
        val bannerPager = findViewById<ViewPager>(R.id.Home_MainBanner)
        //setting the actionbar
        setSupportActionBar(mainToolbar)

        bannerPager.adapter = HomeBannerViewPagerAdapter(supportFragmentManager)
    }

}
