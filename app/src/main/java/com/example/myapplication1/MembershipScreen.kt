package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MembershipScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_membership_screen)

        //get the component with id - go back to the home - from membership
        val picClick12 = findViewById<ImageView>(R.id.imageViewbackbtn)

        picClick12.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        //get the component with id - go back to the home - from membership
        val picClick13 = findViewById<Button>(R.id.buttonb2home)

        picClick13.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

    }
}