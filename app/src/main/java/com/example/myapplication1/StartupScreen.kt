package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class StartupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startup_screen)

        //get the component with id - go to homepage
        val buttonGetStart = findViewById<Button>(R.id.buttonGetStarted)

        buttonGetStart.setOnClickListener{
            val nextPage = Intent(this, LoginScreen::class.java);
            startActivity(nextPage);
            finish();
        }

    }
}