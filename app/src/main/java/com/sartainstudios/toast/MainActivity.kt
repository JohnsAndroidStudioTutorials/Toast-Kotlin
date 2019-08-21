package com.sartainstudios.toast

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toast_button.setOnClickListener {
         Toast.makeText(applicationContext, "John's Android Studio Tutorials are the best in the world", Toast.LENGTH_LONG).show()
        }
    }
}