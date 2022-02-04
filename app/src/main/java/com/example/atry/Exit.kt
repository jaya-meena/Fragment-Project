package com.example.atry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Exit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exit)
    }

    fun goback(view: View) {
        val intent = Intent (this, MainActivity::class.java)
        startActivity(intent)
        //finish()
    }
}