package com.pavanpatel.myapplication_4


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoginActivity :
    AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val btnsignup:
                Button = findViewById(R.id.sign_up_btn)
        val i = Intent(this, RegistrationActivity::class.java)
        btnsignup.setOnClickListener ()
        {
            startActivity(i)
        }
    }
}
