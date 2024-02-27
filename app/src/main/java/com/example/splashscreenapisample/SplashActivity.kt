package com.example.splashscreenapisample

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.ViewTreeObserver

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        // if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        Log.d("MainActivity", "onCreate: I AM RUNNING ON API 12 or higher")
        val start = System.currentTimeMillis()
        findViewById<View>(android.R.id.content).viewTreeObserver.addOnPreDrawListener {
            System.currentTimeMillis() - start > 3000
        }

    }

    fun onJump(view: View) {
        startActivity(Intent(this, MainActivity::class.java))
    }
}