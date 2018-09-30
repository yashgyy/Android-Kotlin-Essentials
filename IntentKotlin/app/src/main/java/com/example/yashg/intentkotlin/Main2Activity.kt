package com.example.yashg.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView2.text=intent.getStringExtra("input")
    }

    fun change(v:View){
        val Intent=Intent(applicationContext,MainActivity::class.java)
        startActivity(Intent)
    }
}
