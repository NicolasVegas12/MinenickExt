package com.minenick.minenickext

import java.util.*
import kotlin.random.Random

val listExcepcionesXML: Map<String, String> = mapOf(
    Pair('"'.toString(), "&quot;"),
    Pair("'", "&apos;"),
    Pair("<", "&lt;"),
    Pair(">", "&gt;"),
    Pair("&", "&amp;")
)

val colorValues = listOf("1","2","3","4","5","6","7","8","9","A","B","C","D","E","F")

fun String.capitalized(): String {
    return this.replaceFirstChar {
        if (it.isLowerCase())
            it.titlecase(Locale.getDefault())
        else it.toString()
    }
}

fun String.xmlFormat(): String {
    var tempString = this
    listExcepcionesXML.map {
        tempString = if (this.contains(it.key)) this.replace(it.key, it.value) else tempString
    }

    return tempString
}

fun String.toDoubleExt(i: Int): Double =
    if (this.isEmpty()) 0.0 else java.lang.Double.parseDouble(this).setDecimal(i)

fun String.getMontoPair(): Pair<String, String> {
    val decimales = this.substring(this.length - 2, this.length)
    val enteros = this.substring(0, this.length - 2)

    return Pair(enteros, decimales)
}

fun String.getGastoFormat(): String {
    if (this.length <= 4) {
        val ceritos = "0000$this"
        return ceritos.substring(ceritos.length - 4, ceritos.length)
    }
    if (this[0] == '0') {
        return this.substring(this.length - 4, this.length)
    }
    return this
}

fun String.toDoubleFormat():Double{
    return this.substring(0,this.length-2).toDouble() + (this.substring(this.length-2,this.length).toDouble()/100)
}
fun String.getRandomColor():String{
    if(this=="#"){
        var newColor = "#"
            for(i in 0..5){
                newColor+= colorValues[Random.nextInt(0, colorValues.size)]
        }
        return  newColor
    }
    return ""
}