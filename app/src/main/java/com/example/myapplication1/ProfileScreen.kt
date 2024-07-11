package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ProfileScreen : AppCompatActivity() {

    //creating variable - show profile details have changed when click save
    lateinit var btnSave:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile_screen)


        val backClick2 = findViewById<Button>(R.id.buttonUpgrademember)

        backClick2.setOnClickListener{
            val home2login = Intent(this, MembershipScreen::class.java);
            startActivity(home2login);
            finish();
        }

        //get the component with id - go back to the home page from editProfile
        val backClick = findViewById<ImageView>(R.id.imageBack2home)

        backClick.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        btnSave = findViewById(R.id.buttonProfileSave)

        btnSave.setOnClickListener{
            SaveProfile()
        }
    }
    //making a function to display text after clicking a button
    fun SaveProfile(){
        Toast.makeText(this, "Profile Details Changed Successfully", Toast.LENGTH_LONG).show()
    }

}