package com.poonia.tictactoeapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.Window
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_startanimation.*

class StartAnimation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startanimation)

     logoImageView.translationY = -1000f
        textViewText.translationY = +1000f

        logoImageView.animate().translationY(0f).duration = 2000
        textViewText.animate().translationY(0f).duration = 2000

        Handler(Looper.getMainLooper()).postDelayed({val intent = Intent(this,Firstpage::class.java)
        startActivity(intent)
        }, 3000)
    }
}