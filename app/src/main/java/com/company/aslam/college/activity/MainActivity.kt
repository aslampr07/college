package com.company.aslam.college.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.ViewPager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.Toolbar
import com.company.aslam.college.R
import com.company.aslam.college.adapter.BulletinBoardAdapter
import com.company.aslam.college.adapter.HomeBannerViewPagerAdapter
import com.company.aslam.college.data.BulletinBoard

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainToolbar = findViewById<Toolbar>(R.id.Home_ActionBar)
        val bannerPager = findViewById<ViewPager>(R.id.Home_MainBanner)
        val bulletinRecycler = findViewById<RecyclerView>(R.id.Home_BulletinBoard)

        //setting the actionbar
        setSupportActionBar(mainToolbar)

        bannerPager.adapter = HomeBannerViewPagerAdapter(supportFragmentManager)

        val bulletinList : MutableList<BulletinBoard> = arrayListOf()
        for (i in 0..3){
            bulletinList.add(BulletinBoard("Heading $i", "This is empty empty body"))
        }
        bulletinRecycler.layoutManager = LinearLayoutManager(this)
        bulletinRecycler.adapter = BulletinBoardAdapter(bulletinList)
    }

}
