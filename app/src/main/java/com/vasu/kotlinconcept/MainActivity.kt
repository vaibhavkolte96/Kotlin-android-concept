package com.vasu.kotlinconcept

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.vasu.kotlinconcept.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.e(Companion.TAG, "onCreate: " + Companion.TAG)
        val basicLogic = BasicLogic()

        Log.e(TAG, "onCreate: Reverse Name = ${basicLogic.reverseString("Vaibhav")}")
        Log.e(TAG, "onCreate: Factorial = ${basicLogic.findFactorial(5)}");
        Log.e(TAG, "onCreate: Palindrome Number = ${basicLogic.isPalindromeNumber(121)}")
        Log.e(TAG, "onCreate: Palindrome String  = ${basicLogic.isPalindromeString("nitin")}")
        Log.e(TAG, "onCreate: Remove vowel = ${basicLogic.removeVowel("VaIbhav")}")
        Log.e(
            TAG,
            "onCreate: is email valid = ${basicLogic.isValidEmail("vaibhav.kolte@ext@ernal.forvia.com")}"
        )
        Log.e(TAG, "onCreate: Find age = ${basicLogic.findAge(1996)}")

        onClickHandle()
    }

    private fun onClickHandle() {
        binding.btnMenu.setOnClickListener { startActivity(Intent(this, MenuActivity::class.java)) }

        binding.btnDatePicker.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    DatePickerActivity::class.java
                )
            )
        }

        binding.btnTimePicker.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    TimePickerActivity::class.java
                )
            )
        }

        binding.btnBottomSheet.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    BottomSheetActivity::class.java
                )
            )
        }

        binding.btnNavBar.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    NavigationBarActivity::class.java
                )
            )
        }

        binding.btnRelativeLayout.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    RelativeLayoutActivity::class.java
                )
            )
        }

        binding.btnCalculateAge.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    FindAgeActivity::class.java
                )
            )
        }

        binding.btnNavDrawer.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    NavigationDrawerActivity::class.java
                )
            )
        }

        binding.btnShare.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    ShareSomethingActivity::class.java
                )
            )
        }
    }



    companion object {
        private const val TAG = "MainActivity"
    }


}