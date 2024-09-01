package com.example.weatherapp_android.repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.weatherapp_android.Models.WeatherData
import com.example.weatherapp_android.api.WeatherDataService

class WeatherDataRepository(private val weatherDataService: WeatherDataService) {
    private val weatherLiveData = MutableLiveData<WeatherData>()
    val weatherData: LiveData<WeatherData>
        get() = weatherLiveData

    suspend fun getWeatherData(latitude: Double, longitude: Double, apiKey: String) {
        val result = weatherDataService.getWeatherData(latitude, longitude, apiKey)
        if(result?.body() != null) {
            weatherLiveData.postValue(result.body())
        }
    }
}