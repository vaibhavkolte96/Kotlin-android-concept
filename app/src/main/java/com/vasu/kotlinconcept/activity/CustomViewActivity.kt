package com.vasu.kotlinconcept.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vasu.kotlinconcept.R

class CustomViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_custom_view)
    }
}