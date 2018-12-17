package com.example.nikita.figures

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemSelectedListener {

    var figures_list = arrayOf("Выберите фигуру", "Круг", "Прямоугольник", "Треугольник")
    var spinner: Spinner? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinner = this.spinFigures
        spinner!!.onItemSelectedListener = this

        val arr_ad = ArrayAdapter(this, android.R.layout.simple_spinner_item, figures_list)
        arr_ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner!!.adapter = arr_ad

    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        var startIntent = Intent()
        when(position){
            1 -> startIntent = Intent(applicationContext, CircleActivity::class.java)
            2 -> startIntent = Intent(applicationContext, RectangleActivity::class.java)
            3 -> startIntent = Intent(applicationContext, TriangleActivity::class.java)
        }
        if (position != 0) {
            startActivity(startIntent)
            Toast.makeText(applicationContext, "Введите требуемые параметры фигуры.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onNothingSelected(parent: AdapterView<*>?) {
    }
}


