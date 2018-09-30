package com.example.yashg.sharedprefrences

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Debug
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val shared=this.getSharedPreferences("com.example.yashg.sharedprefrences", Context.MODE_PRIVATE)// Only private access
        var age=10
        shared.edit().putInt("userAge",age).apply()

        shared.edit().putInt("user",23).apply()

        print(shared.getInt("userAge",0))

        Log.d("Hu",shared.getInt("user",0).toString())

        shared.edit().remove("user").apply()

        Log.d("Hu",shared.getInt("user",0).toString())

    }
}
