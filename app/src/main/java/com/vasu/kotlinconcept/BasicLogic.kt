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
            if (string[i] !in arrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')) {
                updateString += string[i]
            }
        }
        return updateString
    }

    fun isValidEmail(email: String): Boolean {
        return !TextUtils.isEmpty(email) && Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    fun findAge(date: Int): Int {
        val calendar: Calendar = Calendar.getInstance()
        val currentYear = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LocalDate.now().year
        } else {
            calendar[Calendar.YEAR]
        }
        return currentYear - date;
    }

    companion object {
        fun format(value: Int): String {
            return if (value in 0..9) "0$value" else value.toString()
        }

        fun findAge(dobDay: Int, dobMonth: Int, dobYear: Int): String {
            val c = Calendar.getInstance()
            var currentYear = c.get(Calendar.YEAR)
            var currentMonth = c.get(Calendar.MONTH) + 1 // month start with 0 that's why add 1
            var currentDay = c.get(Calendar.DAY_OF_MONTH)

            var dayAge = 0
            var monthAge = 0
            var yearAge = 0
            if (currentDay >= dobDay) {
                dayAge = currentDay - dobDay
            } else {
                when (currentMonth) {
                    1, 5, 7, 8, 10, 12 -> {
                        dayAge = (currentDay + 31) - dobDay
                    }
                    2, 4, 6, 9, 11 -> {
                        dayAge = (currentDay + 30) - dobDay
                    }
                    3 -> {
                        dayAge =
                            if (((currentYear % 4 == 0) && (currentYear % 100 != 0)) || (currentYear % 400 == 0)) {
                                (currentDay + 29) - dobDay
                            } else {
                                (currentDay + 28) - dobDay
                            }
                    }
                }
                currentMonth -= 1
            }

            if (currentMonth >= dobMonth) {
                monthAge = currentMonth - dobMonth
            } else {
                monthAge = (currentMonth + 12) - dobMonth
                currentYear -= 1
            }

            if (currentYear >= dobYear) {
                yearAge = currentYear - dobYear
            }

            return "Your Age = Day : ${format(dayAge)} Month : ${format(monthAge)} Year : $yearAge "
        }
    }

}