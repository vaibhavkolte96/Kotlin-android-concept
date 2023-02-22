package com.vasu.kotlinconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.menu_delete -> Toast.makeText(this,"Delete Click",Toast.LENGTH_SHORT).show()
            R.id.menu_favorite -> Toast.makeText(this,"Favorite Click",Toast.LENGTH_SHORT).show()
            R.id.menu_profile -> Toast.makeText(this,"Profile Click",Toast.LENGTH_SHORT).show()
            R.id.menu_setting -> Toast.makeText(this,"Setting Click",Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}