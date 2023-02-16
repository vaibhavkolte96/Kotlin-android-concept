package com.vasu.kotlinconcept

import android.os.Build
import android.text.TextUtils
import android.util.Patterns
import java.time.LocalDate
import java.util.*

class BasicLogic {

    fun reverseString(string: String): String {
        var reverseString = ""
        for (i in string.length - 1 downTo 0) {
            reverseString += string[i]
        }
        return reverseString
    }

    fun findFactorial(number: Int): Int {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        return factorial
    }

    fun isPalindromeNumber(number: Int): Boolean {
        var temp = number
        var reverse = 0
        while (temp > 0) {
            reverse = (reverse * 10) + temp % 10
            temp /= 10
        }
        return reverse == number
    }

    fun isPalindromeString(string: String): Boolean {
        var reverseString = ""
        for (i in string.length - 1 downTo 0) {
            reverseString += string[i]
        }
        return reverseString == string
    }

    fun removeVowel(string: String): String {
        var updateString = ""
        for (i in string.indices) {
            if (string[i] !in arrayOf('a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U')) {
                updateString += string[i]
            }
        }
        return updateString
    }

    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun findAge(date: Int):Int{
        val calendar: Calendar = Calendar.getInstance()
        val currentYear = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalDate.now().year
        } else {
            calendar[Calendar.YEAR]
        }
        return currentYear - date;
    }

}