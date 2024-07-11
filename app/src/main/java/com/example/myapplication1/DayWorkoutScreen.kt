package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DayWorkoutScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_day_workout_screen)

        val picClick43 = findViewById<ImageView>(R.id.imageViewHOMEBTN)

        picClick43.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        val picClick42 = findViewById<ImageView>(R.id.imageView4)

        picClick42.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }
    }
}