package com.example.kotlinlesson.model

interface Repository {
    fun getWeatherFromServer(): Weather
    fun getWeatherFromLocalStorage() : Weather
}