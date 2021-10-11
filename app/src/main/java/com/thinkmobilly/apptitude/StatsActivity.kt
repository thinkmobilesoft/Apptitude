package com.thinkmobilly.apptitude

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView

class StatsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stats)

        val allStat: ArrayList<StatFeed> = ArrayList()
        allStat.add(StatFeed("Total Score",R.drawable.icon_15_trophy))
        allStat.add(StatFeed("Total Test",R.drawable.group_25))
        allStat.add(StatFeed("Previous Score",R.drawable.iconfinder_12))
        allStat.add(StatFeed("Time Taken",R.drawable.group_24))

        val simpleGrid: GridView = findViewById(R.id.simpleGridView)
        simpleGrid.adapter = StatAdapter(this, allStat)
    }
}