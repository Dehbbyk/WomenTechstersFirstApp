package com.debbie.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val createNAButton: Button = findViewById(R.id.createNewAccount)
        createNAButton.setOnClickListener{
            val intent = Intent (this, CreateNewAccountActivity:: class.java)
            startActivity(intent)
        }

    }
}