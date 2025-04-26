package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
    var day=21
  var result=calculateSalary(day)
    println("Toplam maaş : $result")
}

//Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod.
//1 günde 8 saat çalışılabilir
//Çalışma saat ücreti 10
//Mesai saat ücreti 20
//160 saat üstü mesai sayılır
fun calculateSalary(countDay:Int):Int{
    var result=0
    var isShift=(countDay*8)>160
    if(isShift){
        var shiftHours = (countDay * 8) - 160
        var shiftSalary = shiftHours * 20
        result = (160 * 10) + shiftSalary
    }
    else{
        result=(countDay*8)*10
    }
    return result
}