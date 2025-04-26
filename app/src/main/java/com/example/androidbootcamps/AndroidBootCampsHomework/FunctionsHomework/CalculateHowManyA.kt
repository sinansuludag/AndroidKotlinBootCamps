package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
  calculateHowManyA("Araba")
}

//Parametre olarak girilen kelime içinde kaç adet a harfi olduğunu gösteren metod.
fun calculateHowManyA(word:String){
    var result=0
  for(i in word){

      if(i.lowercaseChar()=='a'){
          result++
      }
  }
    println("$word kelimesinin içinde $result tane a harfi var.")
}