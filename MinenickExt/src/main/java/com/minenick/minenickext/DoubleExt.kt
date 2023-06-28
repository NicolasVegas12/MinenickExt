package com.minenick.minenickext

import kotlin.math.floor
import kotlin.math.pow
import kotlin.math.roundToInt

fun Double.setDecimal( i:Int):Double{
    val dec= 10.0.pow(i.toDouble())
    return ((this*dec).roundToInt().toDouble()/dec)
}
fun Double.getPorcentaje(total:Double):Int{
    return ((this/total)*100).roundToInt()
}
fun Double.getNumeralAndDecimal(i: Int): Pair<Int, Int> {
    val dec = 10.0.pow(i.toDouble())
    val decimal = (this*dec - floor(this)*dec).roundToInt()
    return Pair(floor(this).toInt(), decimal)
}
fun Double.toTextFormat(i:Int):String{
    val dec = 10.0.pow(i+1.toDouble())
    return (this*dec).toInt().toString()
}