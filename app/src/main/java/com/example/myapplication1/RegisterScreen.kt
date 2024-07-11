package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class RegisterScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_screen)

        //get the component with id - go to the homepage
        val buttonSignin = findViewById<Button>(R.id.buttonSignin)

        buttonSignin.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }

        //get the component with id - go to the login page
        val textClick2 = findViewById<TextView>(R.id.textVeiwHaveLogin)

        textClick2.setOnClickListener{
            val bLogin = Intent(this, LoginScreen::class.java);
            startActivity(bLogin);
            finish();
        }
    }
}