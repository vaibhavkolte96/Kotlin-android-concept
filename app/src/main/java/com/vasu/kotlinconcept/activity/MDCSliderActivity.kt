package com.vasu.kotlinconcept.activity

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.google.android.material.slider.BaseOnChangeListener
import com.google.android.material.slider.RangeSlider
import com.google.android.material.slider.Slider
import com.google.android.material.slider.Slider.OnChangeListener
import com.vasu.kotlinconcept.databinding.ActivityMdcsliderBinding

class MDCSliderActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMdcsliderBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMdcsliderBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.normalContinuousSlider.addOnChangeListener { slider, value, fromUser ->
            binding.tvRating.text = value.toString()
        }

        binding.continuousRangeSlider.addOnChangeListener { slider, value, fromUser ->
            binding.tvRating.text = "${slider.values[0]} to ${slider.values[1]}"
        }

        binding.discreteSlider.addOnChangeListener { slider, value, fromUser ->
            binding.tvRating.text = value.toString()
        }

        binding.discreteRangeSlider.addOnChangeListener { slider, value, fromUser ->
            binding.tvRating.text = "${slider.values[0]} to ${slider.values[1]}"
        }

    }
}