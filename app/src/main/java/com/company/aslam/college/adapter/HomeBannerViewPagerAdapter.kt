package com.company.aslam.college.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.company.aslam.college.fragments.BannerFragment

class HomeBannerViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm){

    init {
        //This is a constructor
    }

    override fun getItem(p0: Int): Fragment {
        return BannerFragment()
    }

    override fun getCount(): Int {
        return 2
    }

}