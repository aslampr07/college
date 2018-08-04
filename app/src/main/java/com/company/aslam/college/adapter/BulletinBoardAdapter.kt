package com.company.aslam.college.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.company.aslam.college.R
import com.company.aslam.college.data.BulletinBoard

class BulletinBoardAdapter(private val list: List<BulletinBoard>) : RecyclerView.Adapter<BulletinBoardAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val view = LayoutInflater.from(context).inflate(R.layout.layout_bulletinboard_listitem, parent, false)
        return ViewHolder(view)
    }


    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.headingTextView.text = list[position].header
        holder.bodyTextView.text = list[position].body
    }

    override fun getItemCount() : Int = list.size

    class ViewHolder(v: View): RecyclerView.ViewHolder(v){
        val headingTextView = v.findViewById<TextView>(R.id.Home_BulletinBoard_item_head)
        val bodyTextView = v.findViewById<TextView>(R.id.Home_BulletinBoard_item_body)
    }
}