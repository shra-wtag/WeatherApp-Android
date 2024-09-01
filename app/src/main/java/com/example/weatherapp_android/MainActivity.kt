package com.example.weatherapp_android

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.weatherapp_android.Models.WeatherData
import com.example.weatherapp_android.api.RetrofitHelper
import com.example.weatherapp_android.api.WeatherDataService
import com.example.weatherapp_android.databinding.ActivityMainBinding
import com.example.weatherapp_android.repository.WeatherDataRepository
import com.example.weatherapp_android.viewmodels.WeatherInfoViewModel
import com.example.weatherapp_android.viewmodels.WeatherInfoViewModelFactory
import retrofit2.create

class MainActivity : AppCompatActivity() {
//    lateinit var weatherInfoViewModel: WeatherInfoViewModel
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        val weatherDataService = RetrofitHelper.getRetrofitInstance().create(WeatherDataService::class.java)
//        val repository = WeatherDataRepository(weatherDataService)

//        weatherInfoViewModel = ViewModelProvider(this, WeatherInfoViewModelFactory(repository)).get(WeatherInfoViewModel::class.java)
//        weatherInfoViewModel.weatherData.observe(this, {
//            Log.i("MYTAG", "Temperature: ${it.main.temp}")
//        })
    }
}