package com.example.loginapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlin.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Login_btn.setOnClickListener {
         var status:string = if (username_et.text.toString().equals("TechWorld")
              &&password_et.text.toString().equals("passwpord"))  "Logged In Successfully" else "LogIn Fail"
          Toast.makeText(context:this,status,Toast.LENGTH_SHORT).Show()
        }
    }
}
