package com.arrayyan.lab_week_02_part_03

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Button
import android.content.Intent

class SingleTopActivity : AppCompatActivity() {
    companion object{
        private const val DEBUG = "DEBUG"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_single_top)
        Log.d(DEBUG, "onCreate")

        findViewById<Button>(R.id.button_single_top).setOnClickListener{
            startActivity(
                Intent(this,
                    SingleTopActivity::class.java)
            )
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        Log.d(DEBUG, "onNewIntent")
    }
}