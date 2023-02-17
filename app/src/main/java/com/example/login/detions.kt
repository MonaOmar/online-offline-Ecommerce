package com.example.login

import android.os.Bundle
import android.view.AbsSavedState
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detions.*

class detions:AppCompatActivity()
{ var num=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detions)
        button1.setOnClickListener {
            num++
            textview.text =num.toString()
        }
        button2.setOnClickListener {
            num--
            textview.text =num.toString()
        }
        rest.setOnClickListener {
            num=0
            textview.text =num.toString()
        }
    }
}
