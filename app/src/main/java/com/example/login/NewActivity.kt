package com.example.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class NewActivity : AppCompatActivity() {
   // lateinit var handler:Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)
       Handler().postDelayed({
            var intent=Intent(this,MainActivity ::class.java)
                       startActivity(intent)
          finish( )

       },2000)

}}