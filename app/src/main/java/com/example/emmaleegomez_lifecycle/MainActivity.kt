package com.example.emmaleegomez_lifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var button : Button
    private lateinit var textView: TextView
    private lateinit var editText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "onCreate() called")

        button = findViewById(R.id.button)
        textView = findViewById(R.id.text_view)
        editText = findViewById(R.id.edit_text)

        button.setOnClickListener {view: View ->
            textView.text = getString(R.string.hello)
            editText.setText(getString(R.string.hello))
        }

    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart() called")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume() called")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause() called")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop() called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy() called")
    }

    companion object {
        private const val TAG = "MainActivity"
    }
}