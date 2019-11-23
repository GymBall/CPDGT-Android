package org.gymball.cpdgt_android.util

import android.app.Application
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class ApplicationController : Application() {
    lateinit var networkService: NetworkService
    private val baseUrl ="http://54.180.100.153"
    companion object {

        lateinit var instance : ApplicationController

    }

    override fun onCreate() {
        super.onCreate()

        instance = this //어느 액티비티에서든지 '나'를 할당 할 수 있도록!! instance에 this를 넣어준다!

        buildNetwork()
    }

    fun buildNetwork() {
        val builder = Retrofit.Builder()
        var retrofit = builder
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create())//GSON을 JSON으로 쓸수있도록
            .build()  //베이스 유알엘을 가지고 통신을 할 것

        networkService = retrofit.create(NetworkService::class.java)
    }
}