package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class LoginScreen : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        //get the component with id - go to homepage
        val buttonLogin = findViewById<Button>(R.id.buttonLogin)

        buttonLogin.setOnClickListener{
            val nextPage = Intent(this, MainActivity::class.java);
            startActivity(nextPage);
            finish();
        }

        //get the component with id - go to the register page
        val textClick1 = findViewById<TextView>(R.id.textViewNewUser)

        textClick1.setOnClickListener{
            val bSignin = Intent(this, RegisterScreen::class.java);
            startActivity(bSignin);
            finish();
        }
    }


}