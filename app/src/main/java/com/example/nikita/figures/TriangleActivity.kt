@file:Suppress("DEPRECATION")

package com.example.nikita.figures

import android.annotation.SuppressLint
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_circle.*
import kotlinx.android.synthetic.main.activity_triangle.*

class TriangleActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_triangle)

        but_ps3.setOnClickListener {
            val num_a = text_a.text.toString().toDouble()
            val num_b = text_b.text.toString().toDouble()
            val num_c = text_c.text.toString().toDouble()

            val tP = Tri(num_a, num_b, num_c).per().toString()
            val tS = Tri(num_a, num_b, num_c).squ().toString()

            text_p3.text = "Периметр: $tP"
            text_s3.text = "Площадь: $tS"
        }

        but_back3.setOnClickListener {
            val startIntent = Intent(applicationContext, MainActivity::class.java)
            startActivity(startIntent)
        }
    }
}
