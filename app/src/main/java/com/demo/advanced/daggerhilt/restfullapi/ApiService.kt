package com.demo.advanced.daggerhilt.restfullapi

import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("load_more")
    suspend fun mGetApiData(@Body string: String):Any
}