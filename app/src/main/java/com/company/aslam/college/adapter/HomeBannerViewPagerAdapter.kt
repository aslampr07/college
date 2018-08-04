package com.company.aslam.college.adapter

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.company.aslam.college.R
import com.company.aslam.college.fragments.BannerFragment

class HomeBannerViewPagerAdapter(fm: FragmentManager) : FragmentStatePagerAdapter(fm){


    //Banner Images.
    private val images = intArrayOf(R.drawable.college1, R.drawable.college2, R.drawable.college3)

    override fun getItem(position: Int): Fragment {
        val bundle = Bundle()
        bundle.putInt("image", images[position])
        val bannerFragment = BannerFragment()
        bannerFragment.arguments = bundle
        return bannerFragment
    }

    override fun getCount() = images.size

}