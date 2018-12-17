@file:Suppress("DEPRECATION")

package com.example.nikita.figures

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*
import kotlinx.android.synthetic.main.activity_rectangle.*

class RectangleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rectangle)

        but_ps2.setOnClickListener {
            val num_w = text_w.text.toString().toDouble()
            val num_h = text_h.text.toString().toDouble()

            val tP = Rec(num_w, num_h).per().toString()
            val tS = Rec(num_w, num_h).squ().toString()

            text_p2.text = "Периметр: $tP"
            text_s2.text = "Площадь: $tS"
        }

        but_back2.setOnClickListener {
            val startIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(startIntent)
        }
    }
}
