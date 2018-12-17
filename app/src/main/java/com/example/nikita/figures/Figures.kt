package com.example.nikita.figures

class Cir(val rad: Double){
    fun per(): Double = 2.0 * Math.PI * rad
    fun squ(): Double = Math.PI * Math.pow(rad, 2.0)
}


class Rec(val width: Double, val height: Double){
    fun per(): Double = width * 2 + height * 2
    fun squ(): Double = width * height
}

class Tri(val sideA: Double, val sideB: Double, val sideC: Double){
    fun per(): Double = sideA + sideB + sideC
    fun p_per(): Double = per()/2
    fun squ(): Double = Math.sqrt(p_per()*(p_per()-sideA)*(p_per()-sideB)*(p_per()-sideC))
}