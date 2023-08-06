package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var bindingClass: ActivityMainBinding
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingClass = ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingClass.root)
        bindingClass.textView.text = counter.toString()
        bindingClass.button.setOnClickListener {

            bindingClass.textView.text = (counter--).toString()
        }

        bindingClass.button2.setOnClickListener {
            bindingClass.textView.text = (counter++).toString()

        }
    }
}