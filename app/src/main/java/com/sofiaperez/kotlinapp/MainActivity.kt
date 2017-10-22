package com.sofiaperez.kotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // mutable variables
        var number = 7
        var text: String = "testing out variables"
        var view = View(this)

        // immutable variables
        val x: Int = 20
        val y: Long = x.toLong()

        val mainTextView: View = findViewById(R.id.mainTextView)
        if (mainTextView is TextView) {
            mainTextView.text = "Hello Sofia!"
        }
    }
}
