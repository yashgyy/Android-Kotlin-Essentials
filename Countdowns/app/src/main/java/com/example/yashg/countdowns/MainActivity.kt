package com.example.yashg.countdowns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        object:CountDownTimer(10000,1000){
            override fun onFinish() {
               texting.text="Hello"
            }

            override fun onTick(millisUntilFinished: Long) {
               texting.text= (millisUntilFinished/1000).toString()
            }

        }.start()
    }
}
