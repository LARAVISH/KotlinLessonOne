package com.example.kotlinlesson.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlinlesson.model.Repository
import com.example.kotlinlesson.model.RepositoryImplementation
import java.lang.Thread.sleep

class MainViewModel(private val liveData: MutableLiveData<AppState> = MutableLiveData(),
private val repository: RepositoryImplementation = RepositoryImplementation()
) :ViewModel() {


    fun getLiveData() : LiveData<AppState> = liveData


    fun getWeather(){
       Thread{
           sleep(1000)


           val rand = (0..40).random()
           if(rand < 20){
               liveData.postValue(AppState.Success(repository.getWeatherFromServer()))
           }else{
               liveData.postValue(AppState.Error(IllegalAccessError("Error")))
           }

       }.start()

    }

}