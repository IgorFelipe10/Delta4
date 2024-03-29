package com.example.delta

import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("/")
    fun getProdutos(): Call<List<Produto>>

    @GET("/")
    fun getUsuario(): Call<Usuario>
}
