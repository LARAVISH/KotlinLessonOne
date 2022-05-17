package com.example.kotlinlesson.viewmodel

import com.example.kotlinlesson.model.Weather

sealed class AppState {
   data class Loading(val progress : Int): AppState()
   data class Success(val weatherData : Weather): AppState()
   data class Error(val error : Throwable): AppState()
}