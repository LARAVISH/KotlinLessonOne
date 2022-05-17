package com.example.kotlinlesson.model

data class Weather(val city : City = getDefaultCity(), val temperature : Int = 20, val feels_like : Int = 19)

data class City(val name : String, val lon : Double, val lat : Double)
fun getDefaultCity() = City("Москва", 37.5 , 55.45)