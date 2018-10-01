package com.example.yashg.handlerloop

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number:Int=0
    var handler:Handler=Handler()
    var runnable:Runnable= Runnable {  }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view:View){
        number=0

        runnable=object : Runnable{
            override fun run() {
                textView.text=number.toString()
                number++
                textView.text=number.toString()
                handler.postDelayed(this,1000)

            }

        }
        handler.post(runnable)
    }


    fun reset(view: View){
        handler.removeCallbacks(runnable)
        number=0
        textView.text=number.toString()
    }
}
