package com.vasu.kotlinconcept.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.vasu.kotlinconcept.ChatFragment
import com.vasu.kotlinconcept.HomeFragment
import com.vasu.kotlinconcept.R
import com.vasu.kotlinconcept.SettingFragment

class NavigationBarActivity : AppCompatActivity() {
    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navigation_bar)
        loadFragment(HomeFragment())
        bottomNav = findViewById(R.id.bottomNav)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.navHome -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.navChat -> {
                    loadFragment(ChatFragment())
                    true
                }
                R.id.navSetting -> {
                    loadFragment(SettingFragment())
                    true
                }
                else -> {
                    Toast.makeText(this,"Page not available",Toast.LENGTH_SHORT).show()
                    true
                }
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}