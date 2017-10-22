package com.sofiaperez.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

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

        val person = Person("Sofia", "Perez")

        // Using kotlin extensions
        mainTextView.text = "Hello ${person.getFullName()}!"

    }
}
