package com.vasu.kotlinconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialog

class BottomSheetActivity : AppCompatActivity() {
    private val TAG = "BottomSheetActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_sheet)

        Log.e(TAG, "onCreate: ")
        val btnViewBottomSheet = findViewById<Button>(R.id.btnViewBottomSheet)

        btnViewBottomSheet.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.item_bottom_sheet, null)
            val dialog = BottomSheetDialog(this)
            dialog.setContentView(view)
            dialog.show()

            val openSetting = view.findViewById<Button>(R.id.btnOpenSetting)
            openSetting.setOnClickListener {
                Toast.makeText(this, "Opening setting", Toast.LENGTH_SHORT).show()
                dialog.cancel()
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(TAG, "onStart: " )
    }

    override fun onResume() {
        super.onResume()
        Log.e(TAG, "onResume: " )
    }

    override fun onRestart() {
        super.onRestart()
        Log.e(TAG, "onRestart: " )
    }

    override fun onPause() {
        super.onPause()
        Log.e(TAG, "onPause: " )
    }

    override fun onStop() {
        super.onStop()
        Log.e(TAG, "onStop: " )
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TAG, "onDestroy: " )
    }
}
