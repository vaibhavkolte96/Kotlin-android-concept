package com.vasu.kotlinconcept.activity

import android.annotation.SuppressLint
import android.app.TimePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.vasu.kotlinconcept.BasicLogic.Companion.format
import com.vasu.kotlinconcept.databinding.ActivityTimePickerBinding
import java.util.*

class TimePickerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTimePickerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTimePickerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClickHandle()
    }

    @SuppressLint("SetTextI18n")
    private fun onClickHandle() {
        binding.btnPickTime.setOnClickListener {
            val currentTime = Calendar.getInstance()
            val startHour = currentTime.get(Calendar.HOUR_OF_DAY)
            val startMinute = currentTime.get(Calendar.MINUTE)

//            TimePickerDialog(this, TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
//                run {
//                    binding.txtTimeView.text = "$hourOfDay:$minute"
//                }
//            }, startHour, startMinute, false).show()

            // TODO Same as per above
            TimePickerDialog(this, { _, hourOfDay, minute ->
                run {
                    binding.txtTimeView.text =
                        "${format(hourOfDay % 12)}:${format(minute)} ${if (hourOfDay > 12) "PM" else "AM"}"
                }
            }, startHour, startMinute, false).show()
        }
    }


}