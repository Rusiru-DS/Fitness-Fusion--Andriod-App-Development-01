package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class WorkoutScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_workout_screen)

        //get back to home tab - way 1
        val picClick5 = findViewById<ImageView>(R.id.imageB2HomefromEx)

        picClick5.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        //get back to home tab - way 1
        val picClick6 = findViewById<ImageView>(R.id.imagehomebtn)

        picClick6.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }


        val picClick90 = findViewById<ImageView>(R.id.imageGotoMember)

        picClick90.setOnClickListener{
            val home2login = Intent(this, MembershipScreen::class.java);
            startActivity(home2login);
            finish();
        }
    }
}