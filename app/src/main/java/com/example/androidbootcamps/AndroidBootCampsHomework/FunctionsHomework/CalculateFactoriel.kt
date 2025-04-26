package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
    var sayi=4
  var result=calculateFactoriel(sayi)
    println("$sayi nin faktöriyeli: $result")
}

//Parametre olarak girilen sayının faktöriyel değerini hesapayıp geri döndüren metod.
fun calculateFactoriel(sayi:Int) :Int{
    var toplam=1

    for (i in 1..sayi){
        toplam *= i
    }
    return toplam
}