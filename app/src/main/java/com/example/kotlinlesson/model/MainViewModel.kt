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
           sleep(1000)


           val rand = (0..40).random()
           if(rand > 20){
               liveData.postValue(AppState.Success("Жара"))
           }else{
               liveData.postValue(AppState.Error(IllegalAccessError("Error")))
           }

       }.start()

    }

}