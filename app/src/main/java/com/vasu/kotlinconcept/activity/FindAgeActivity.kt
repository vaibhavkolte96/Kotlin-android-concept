package com.vasu.kotlinconcept.activity

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vasu.kotlinconcept.BasicLogic
import com.vasu.kotlinconcept.databinding.ActivityFindAgeBinding
import java.util.*

class FindAgeActivity : AppCompatActivity() {

    lateinit var binding: ActivityFindAgeBinding
    lateinit var c: Calendar
    private var currentYear: Int = 0
    private var currentMonth: Int = 0
    private var currentDay: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFindAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnDOB.setOnClickListener {
            // Take year, month and day from calender
            c = Calendar.getInstance()
            currentYear = c.get(Calendar.YEAR)
            currentMonth = c.get(Calendar.MONTH)
            currentDay = c.get(Calendar.DAY_OF_MONTH)
            // Initialize calender date picker
            val datePicker = DatePickerDialog(
                this, { _, year, month, dayOfMonth ->
                    run {
                        binding.txtShowAge.text = BasicLogic.findAge(dayOfMonth, month + 1, year)
                    }
                }, currentYear, currentMonth, currentDay
            )

            // set max date user unable to choose next date
            datePicker.datePicker.maxDate = c.timeInMillis
            // show date picker dialog
            datePicker.show()
        }
    }


}