package com.gslahane.aboutme

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Button click event
        ok_button.setOnClickListener{
            nickname_tv.visibility = View.VISIBLE
            nickname_tv.text = nickname_et.text
        }
    }
}
