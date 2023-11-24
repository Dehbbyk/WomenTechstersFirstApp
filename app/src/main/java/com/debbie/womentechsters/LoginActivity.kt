package com.debbie.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityEvent
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
        val forget: Button = findViewById(R.id.txt3)
        forget.setOnClickListener{
            val intent = Intent(this, ForgetPasswordActivity:: class.java)

            startActivity(intent)
        }
        val loginBtn: Button = findViewById(R.id.loginButton)
        loginBtn.setOnClickListener{
            val i = Intent(this, HomeActivity:: class.java)

            startActivity(i)
        }
    }
}
