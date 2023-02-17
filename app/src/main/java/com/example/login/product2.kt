package com.example.login

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detions.*
import kotlinx.android.synthetic.main.detions.rest
import kotlinx.android.synthetic.main.detions.textview
import kotlinx.android.synthetic.main.product2.*


class product2: AppCompatActivity()
    { var num=0
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.product2)
            button11.setOnClickListener {
                num++
                textview1.text =num.toString()
            }
            button22.setOnClickListener {
                num--
                textview1.text =num.toString()
            }
            restt.setOnClickListener {
                num=0
                textview1.text =num.toString()
            }
        }
    }


