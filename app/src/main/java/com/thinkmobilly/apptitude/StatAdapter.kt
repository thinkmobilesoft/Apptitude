package com.thinkmobilly.apptitude

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter

class StatAdapter (private val context: Context,
                   private val AllStats: ArrayList<StatFeed>): BaseAdapter(){
    override fun getCount(): Int {
        return AllStats.count()
    }

    override fun getItem(position: Int): Any {
        return position.toLong()
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        TODO("Not yet implemented")
    }
}