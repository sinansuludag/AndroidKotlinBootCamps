package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
    println("Dönüştürmek istediğiniz dereceyi giriniz.")
    var celcius= readLine()!!.toDouble()
  var result= convertToFahrenhiet(celcius)
    println("$celcius celcius = $result Fahrenhiet")
}

//Parametre olarak girilen dereceyi Fahrenhiet'e dönüştürdükten sonra geri döndüren metod.
fun convertToFahrenhiet(celciusDegree:Double):Double {
  var convertResult=celciusDegree*1.8+32
    return  convertResult
}