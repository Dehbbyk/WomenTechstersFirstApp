package com.debbie.womentechsters

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import javax.security.auth.login.LoginException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val joinButton:Button = this.findViewById(R.id.joinNowButton)

        joinButton.setOnClickListener{

        }
    }

}