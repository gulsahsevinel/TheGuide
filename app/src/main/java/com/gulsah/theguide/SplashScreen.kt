package com.gulsah.theguide

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.gulsah.theguide.databinding.ActivitySplashScreenBinding

class SplashScreen : AppCompatActivity() {
    private val splashScreenImageOut : Long = 2500

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()

        Handler().postDelayed({
            val intent = Intent(this , MainActivity::class.java)
            startActivity(intent)
            finish()
        },splashScreenImageOut)

    }


}