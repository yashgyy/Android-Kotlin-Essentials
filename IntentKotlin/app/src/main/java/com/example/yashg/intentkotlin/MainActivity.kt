package com.example.yashg.intentkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun change(v: View){
        val Intent1= Intent(applicationContext,Main2Activity::class.java)
        Intent1.putExtra("input",editText.text.toString())
        startActivity(Intent1)
    }
}
