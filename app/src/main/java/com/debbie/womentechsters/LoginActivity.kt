package com.debbie.womentechsters

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityEvent
import android.widget.Button
import android.widget.EditText
import com.google.android.material.snackbar.Snackbar

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
        val usernameEdt: EditText = findViewById(R.id.editText)
        var passwordEdt: EditText = findViewById(R.id.editText2)
       loginBtn.setOnClickListener{
           val userUsernameEntered: String = usernameEdt.text.toString()
           val userPasswordEntered: String = passwordEdt.text.toString()
           var message = "";
           if(userUsernameEntered.isEmpty() and userPasswordEntered.isEmpty()){
               message = "You need to input a username and password"
           }else{
               if (userUsernameEntered.isEmpty()){
                   message = "Input a username"
               }else{
                   if (userPasswordEntered.isEmpty())
                       message ="Input a password"
               }
           }
           Snackbar.make(findViewById(R.id.loginAct), message, Snackbar.LENGTH_LONG).show()
       }

        loginBtn.setOnClickListener{
            val i = Intent(this, HomeActivity:: class.java)

            startActivity(i)
        }
    }

}
