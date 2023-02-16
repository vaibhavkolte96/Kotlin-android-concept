package com.vasu.kotlinconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(Companion.TAG, "onCreate: " + Companion.TAG)
        val basicLogic = BasicLogic()

        Log.e(TAG, "onCreate: Reverse Name = ${basicLogic.reverseString("Vaibhav")}")
        Log.e(TAG, "onCreate: Factorial = ${basicLogic.findFactorial(5)}");
        Log.e(TAG, "onCreate: Palindrome Number = ${basicLogic.isPalindromeNumber(121)}" )
        Log.e(TAG, "onCreate: Palindrome String  = ${basicLogic.isPalindromeString("nitin")}")
        Log.e(TAG, "onCreate: Remove vowel = ${basicLogic.removeVowel("VaIbhav")}" )
        Log.e(TAG, "onCreate: is email valid = ${basicLogic.isValidEmail("vaibhav.kolte@ext@ernal.forvia.com")}" )
        Log.e(TAG, "onCreate: Find age = ${basicLogic.findAge(1996)}" )

    }

    companion object {
        private const val TAG = "MainActivity"
    }


}