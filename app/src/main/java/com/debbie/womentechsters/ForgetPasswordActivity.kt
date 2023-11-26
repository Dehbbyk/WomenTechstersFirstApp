package com.debbie.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        val loginButton: TextView = findViewById(R.id.register_now)
        loginButton.setOnClickListener{
            navigateToLoginPage()
        }
    }

    private fun navigateToLoginPage() {
        val i = Intent(this, LoginActivity::class.java)

        startActivity(i)
    }

}