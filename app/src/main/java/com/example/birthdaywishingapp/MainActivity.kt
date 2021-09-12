package com.example.birthdaywishingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun createGreet(view : View) {

        val username = findViewById<EditText>(R.id.userName)

        val name = username.editableText.toString()

        val intent = Intent(this,Gift::class.java)

        intent.putExtra("name",name)

        startActivity(intent)

    }
}