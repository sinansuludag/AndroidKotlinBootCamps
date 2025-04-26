package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
    var edgeCount=3
  var result=sumOfInteriorAngles(edgeCount)
    println("$edgeCount kenarlı bir geometrik şeklin iç açıları toplamı : $result")
}

//Parametre olarak girilen kenar sayısına göre iç açılar toplamını hesaplayıp sonucu geri gönderen metod.
fun sumOfInteriorAngles(edgeCount:Int):Int{
    var result=(edgeCount-2)*180
    return result
}