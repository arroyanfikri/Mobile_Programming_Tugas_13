package com.royyan.senengmovie13.data.client

import com.royyan.senengmovie13.data.api.ApiService
import com.royyan.senengmovie13.utils.BASE_URL
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiClient {

    private val client = OkHttpClient.Builder().apply {
        connectTimeout(30, TimeUnit.SECONDS)
        readTimeout(30, TimeUnit.SECONDS)
        writeTimeout(30, TimeUnit.SECONDS)
    }.build()

    val instance = Retrofit.Builder().apply {
        baseUrl(BASE_URL)
        client(client)
        addConverterFactory(GsonConverterFactory.create())
    }.build()
        .create(ApiService::class.java)

}