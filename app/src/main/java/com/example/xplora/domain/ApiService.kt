package com.example.xplora.domain

import com.example.xplora.domain.model.pdv
import com.example.xplora.domain.model.user
import com.example.xplora.domain.request.LoginRequest
import com.example.xplora.domain.request.RegisterRequest
import com.example.xplora.domain.responses.LoginResponse
import com.example.xplora.domain.responses.RegisterResponse
import com.example.xplora.utils.Constants
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @POST(Constants.LOGIN_URL)
    fun login(@Body request: LoginRequest): Call<LoginResponse>

    @POST(Constants.SIGNUP_URL)
    fun register(@Body request: RegisterRequest): Call<RegisterResponse>

    @GET("users/{id}")
    fun getUserId(@Path("id")id:Int):Call<user>

    @GET("pdvs")
    fun getPdvs():Call<List<pdv>>


}