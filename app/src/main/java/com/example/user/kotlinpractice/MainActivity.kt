package com.example.user.kotlinpractice

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
//import below stuffs for layouts/xml
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv1.setText("New Text")
        tv2.setText("New Sama")
        val color = Color.CYAN;
        tv1.setBackgroundColor(color)
    }


}

