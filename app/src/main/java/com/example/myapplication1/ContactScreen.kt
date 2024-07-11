package com.example.myapplication1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class ContactScreen : AppCompatActivity() {

    lateinit var btnSubmit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_screen)

        //get back
        val click2bac = findViewById<ImageView>(R.id.imageViewgo2home)

        click2bac.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        //go back top home
        val Clic2home = findViewById<ImageView>(R.id.imageclickonHome)

        Clic2home.setOnClickListener{
            val home2login = Intent(this, MainActivity::class.java);
            startActivity(home2login);
            finish();
        }

        //submit contact
        btnSubmit = findViewById(R.id.buttonContactSubmit)

        btnSubmit.setOnClickListener{
            SubmitContact()
        }

    }

    fun SubmitContact(){
        Toast.makeText(this, "Contact Mail Sent Successfully", Toast.LENGTH_LONG).show()
    }


}