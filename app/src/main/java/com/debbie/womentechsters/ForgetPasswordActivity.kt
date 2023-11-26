package com.debbie.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class ForgetPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)

        val continueButton: Button = findViewById(R.id.con)
        val emailEdt: EditText = findViewById(R.id.txt_2)
        continueButton.setOnClickListener{
            val userEmailEntered: String = emailEdt.text.toString()

            var message = "";
            if(userEmailEntered.isEmpty()){
                message = "You need to enter a message"
            }else{
                message = "A recovery email has been sent to $userEmailEntered"
            }
            Snackbar
                .make(
                    findViewById(R.id.layout),
                    message,
                    Snackbar.LENGTH_LONG)
                .show()
        }

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