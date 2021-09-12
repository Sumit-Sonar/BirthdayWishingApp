package com.example.birthdaywishingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Gift : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gift)

        val name = intent.getStringExtra("name")

        val text = findViewById<TextView>(R.id.textView2)

        text.text = "Wish You A Many Many Return's Of The Day \n$name \n May Your Dream Comes True To Be Slim :)"
    }
}