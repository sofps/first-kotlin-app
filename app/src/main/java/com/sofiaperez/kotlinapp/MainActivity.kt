package com.sofiaperez.kotlinapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.toast
import org.jetbrains.anko.uiThread

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainButtonTryIt.setOnClickListener {
            if (isOk()) {
                val person = Person(mainEditTextName.text.toString(), mainEditTextSurname.text.toString())
                mainTextViewGreeting.text = "Hello ${person.getFullName()}!"
            }
        }

        doAsync {
            var result = runLongTask()
            uiThread {
                toast(result)
            }
        }
    }

    private fun isOk(): Boolean {
        var isOk = true
        if (mainEditTextName.length() == 0) {
            mainEditTextName.error = "Name can't be empty"
            isOk = false
        }
        if (mainEditTextSurname.length() == 0) {
            mainEditTextSurname.error = "Surname can't be empty"
            isOk = false
        }
        return isOk
    }

    private fun runLongTask(): String {
        return "Testing Anko library"
    }
}
