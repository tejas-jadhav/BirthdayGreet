package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_NAME = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        val name = intent.getStringExtra(EXTRA_NAME) as String
        val birthdayGreetingText = findViewById<TextView>(R.id.birthdayGreeting)
        birthdayGreetingText.text = "Happy Birthday\n$name !!!"
    }
}