package com.example.kotlinlesson.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinlesson.viewmodel.AppState
import java.lang.Thread.sleep

class MainViewModel(private val liveData: MutableLiveData<AppState> = MutableLiveData()) :ViewModel() {


    fun getLiveData() : LiveData<AppState> = liveData

    fun getWeatherFromServer(){
       Thread{
           liveData.postValue(AppState.Loading(0))
           sleep(5000)
           liveData.postValue(AppState.Success("Cold"))
       }.start()

    }

}