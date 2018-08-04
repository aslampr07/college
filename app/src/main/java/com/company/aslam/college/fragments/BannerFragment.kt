package com.company.aslam.college.fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.company.aslam.college.R

class BannerFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_banner, container, false)

        val bannerView = view.findViewById<ImageView>(R.id.Home_BannerImageView)
        bannerView.setImageResource(arguments!!.getInt("image"))

        return view
    }


}
