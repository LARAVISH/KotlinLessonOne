package com.example.kotlinlesson.model

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.Thread.sleep

class MainViewModel(private val liveData: MutableLiveData<Any> = MutableLiveData()) :ViewModel() {


    fun getLiveData() : LiveData<Any> = liveData

    fun getWeatherFromServer(){
        Thread{
            sleep(2000)
           // liveData.value = Any()//asinchron
            liveData.postValue(Any()) //sinchron
        }
    }

}