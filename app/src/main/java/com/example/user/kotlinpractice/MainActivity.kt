package com.example.user.kotlinpractice

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import kotlin.jvm.javaClass
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

    fun goToGridiew(view:View){
        val intent = Intent(this, GridViewKotlin::class.java)
        startActivity(intent)
    }


}

