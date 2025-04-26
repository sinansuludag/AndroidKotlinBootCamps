package com.example.androidbootcamps.AndroidBootCampsHomework.FunctionsHomework

fun main() {
  var quotaAmount=70
    var result= calculateQuotaPrice(quotaAmount)
    println("Ödemeniz gereken ücret : $result")
}

//Parametre olarak girilen kota miktarına göre ücreti hesaplayarak ger döndüren metod.
//50 GB = 100
//Kota aşmıdan sonra her 1 GB 4 tldir.
fun calculateQuotaPrice(quotaAmount:Int):Int{
    var result=0
    if(quotaAmount<=50){
        result=100
    }
    else{
        var extra=quotaAmount-50
        result=100+extra*4
    }
    return  result
}