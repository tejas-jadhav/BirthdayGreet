package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun handleCreateButtonClick(view: View) {
        val nameInput = findViewById<EditText>(R.id.nameInput).editableText.toString()

        val intent = Intent(this, BirthdayGreetingActivity::class.java)

        intent.putExtra(BirthdayGreetingActivity.EXTRA_NAME, nameInput)

        startActivity(intent)

    }

}