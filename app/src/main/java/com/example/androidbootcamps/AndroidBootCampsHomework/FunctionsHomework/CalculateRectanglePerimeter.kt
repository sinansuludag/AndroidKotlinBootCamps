package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
  calculateRectanglePerimeter(4.0,8.0)
}

//Kenarları parametre olarak girilen ve dikdörtgenin çevresini hesaplayan metod.
fun calculateRectanglePerimeter(shortEdge:Double,longEdge:Double){
    var result=2*(shortEdge+longEdge)
    println("Dikdörtgenin çevresi : $result")
}