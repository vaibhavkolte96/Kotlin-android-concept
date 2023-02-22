package com.vasu.kotlinconcept

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Calendar

class DatePickerActivity : AppCompatActivity() {

    private lateinit var btnPickDate: Button
    private lateinit var txtDateView: TextView

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_picker)

        btnPickDate = findViewById(R.id.btnPickDate)
        txtDateView = findViewById(R.id.txtDateView)

        // Take year, month and day from calender
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)

        // on button click open date picker
        btnPickDate.setOnClickListener {

            // Open date picker
//            val dpd = DatePickerDialog(
//                this, DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
//                    run {
//                        txtDateView.text = "Date : $year/${month + 1}$dayOfMonth"
//                    }
//
//                }, year, month, day
//            ).show()


            // TODO Same as per above
            DatePickerDialog(
                this, { _, year, month, dayOfMonth ->
                    run {
                        txtDateView.text = "Date : ${BasicLogic.format(dayOfMonth)}/${BasicLogic.format(month + 1)}/$year"
                    }
                }, year, month, day
            ).show()
        }
    }
}