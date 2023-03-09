package com.josh.amazon

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils

class splashscreen : AppCompatActivity() {
    internal val TIME_OUT = 4000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)
        Handler().postDelayed({
            startActivity(Intent(this@splashscreen,MainActivity::class.java))
            finish()
        },TIME_OUT.toLong())

    }
}