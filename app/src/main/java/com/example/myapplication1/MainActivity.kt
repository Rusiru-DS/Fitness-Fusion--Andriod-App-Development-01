package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //get the component with id - go back to the login page - Logout
        val picClick1 = findViewById<ImageView>(R.id.imageClickLogout)

        picClick1.setOnClickListener{
            val home2login = Intent(this, LoginScreen::class.java);
            startActivity(home2login);
            finish();
        }

        //get the component with id - go back to the login page - Logout
        val picClick11 = findViewById<ImageView>(R.id.imageClickMembership)

        picClick11.setOnClickListener{
            val home2login = Intent(this, MembershipScreen::class.java);
            startActivity(home2login);
            finish();
        }


        //get the component with id - go to edit profile
        val picClick2 = findViewById<ImageView>(R.id.imageClickProfile)

        picClick2.setOnClickListener{
            val home2login = Intent(this, ProfileScreen::class.java);
            startActivity(home2login);
            finish();
        }

        //get to the excercises tab - Way 1
        val picClick3 = findViewById<Button>(R.id.buttonG2Excer)

        picClick3.setOnClickListener{
            val home2login = Intent(this, DayWorkoutScreen::class.java);
            startActivity(home2login);
            finish();
        }

        //get to excercises tab - Way 2
        val picClick4 = findViewById<ImageView>(R.id.imageClickFitness)

        picClick4.setOnClickListener{
            val home2login = Intent(this, WorkoutScreen::class.java);
            startActivity(home2login);
            finish();
        }


        //get to contact us page
        val spicClick4 = findViewById<ImageView>(R.id.imageClickContact)

        spicClick4.setOnClickListener{
            val gotocontact = Intent(this, ContactScreen::class.java);
            startActivity(gotocontact);
            finish();
        }

    }
}