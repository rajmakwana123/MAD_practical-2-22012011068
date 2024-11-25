package com.example.mad_practical_2_22012011068

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        Showmessage("onCreate method is called")
    }
    val TAG="MainActivity"
    fun Showmessage(msg:String){
        Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()

    }

    override fun onStart() {
        super.onStart()
        Showmessage("onStart method is called.")
    }

    override fun onResume() {
        super.onResume()
        Showmessage("onResume method is called")
    }


    override fun onPause() {
        super.onPause()
        Showmessage("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        Showmessage("onstop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Showmessage("ondestroy method is called")
    }

    override fun onRestart() {
        super.onRestart()
        Showmessage("onRestart method is called")
    }


}