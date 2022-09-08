package com.example.myapplication3.net.base

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val baseUrl = ""

    fun retrofit(): Retrofit {
        val client = OkHttpClient.Builder().build()
        return Retrofit.Builder().client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(baseUrl).build()
    }
}