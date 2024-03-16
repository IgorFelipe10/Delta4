package com.example.delta

import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit

class Retrofit {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://f29a0be2e-37d8-4559-a1be-38d72e7ed7f1-00-2p3c7fi3ajv8b.picard.replit.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService = retrofit.create(ApiService::class.java)
}
