package com.thinkmobilly.apptitude

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class CategoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        val startbtn: ImageButton = findViewById(R.id.startBtn)
        val intent: Intent = Intent(this,Question::class.java)


        startbtn.setOnClickListener {
            startActivity(intent)
        }
    }
}