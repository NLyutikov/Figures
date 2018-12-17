@file:Suppress("DEPRECATION")

package com.example.nikita.figures

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*
import kotlinx.android.synthetic.main.activity_rectangle.*

class CircleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_circle)

        but_ps1.setOnClickListener {
            val num_r = text_r.text.toString().toDouble()

            val tP = Cir(num_r).per().toString()
            val tS = Cir(num_r).squ().toString()

            text_p1.text = "Периметр: $tP"
            text_s1.text = "Площадь: $tS"
        }

        but_back1.setOnClickListener {
            val startIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(startIntent)
        }
    }
}
