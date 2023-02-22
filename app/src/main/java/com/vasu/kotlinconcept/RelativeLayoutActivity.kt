package com.vasu.kotlinconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.vasu.kotlinconcept.databinding.ActivityRelativeLayoutBinding
import com.vasu.kotlinconcept.databinding.ActivityTimePickerBinding

class RelativeLayoutActivity : AppCompatActivity() {
    lateinit var binding: ActivityRelativeLayoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRelativeLayoutBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener {
            if (binding.etEmailId.text == null || binding.etEmailId.text.isEmpty()) {
                Toast.makeText(this, "Email is empty", Toast.LENGTH_SHORT).show()
            } else if (binding.etPassword.text == null || binding.etPassword.text.isEmpty()) {
                Toast.makeText(this, "Password is empty", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(
                    this, "Email = ${binding.etEmailId.text} \n" +
                            "Password = ${binding.etPassword.text}", Toast.LENGTH_LONG
                ).show()
            }
        }
    }
}