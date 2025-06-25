package com.example.marsphotos.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.Serializable
import retrofit2.Retrofit
import retrofit2.http.GET
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType


@Serializable
interface MarsApiService {
    @GET("photos")
    suspend fun getPhotos(): List<MarsPhoto>
}


