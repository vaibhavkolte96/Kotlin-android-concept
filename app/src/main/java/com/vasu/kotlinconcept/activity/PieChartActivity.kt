package com.vasu.kotlinconcept.activity

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vasu.kotlinconcept.databinding.ActivityPieChartBinding
import org.eazegraph.lib.models.PieModel

class PieChartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityPieChartBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPieChartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvR.text = "40"
        binding.tvPython.text = "30"
        binding.tvCPP.text = "5"
        binding.tvJava.text = "25"

        with(binding.piechart) {
            addPieSlice(PieModel("R", 40.0f, Color.parseColor("#FFA726")))
            addPieSlice(PieModel("Python", 30.0f, Color.parseColor("#66BB6A")))
            addPieSlice(PieModel("C++", 5.0f, Color.parseColor("#EF5350")))
            addPieSlice(PieModel("JAVA", 25.0f, Color.parseColor("#29B6F6")))

            startAnimation()
        }
    }


}