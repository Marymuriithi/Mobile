package com.example.hello

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin.setOnClickListener{
            var userName = etUserName.text.toString()
            var password = etPassword.text.toString()
            Toost.makeText(baseContext.password.Toost.LENGTH_LONG)show
        }

    }
}
