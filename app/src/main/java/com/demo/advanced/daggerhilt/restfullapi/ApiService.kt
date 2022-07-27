package com.demo.advanced.daggerhilt.restfullapi

import com.demo.advanced.daggerhilt.data.response.ActivityData
import com.google.gson.JsonArray
import org.json.JSONArray
import retrofit2.Response
import retrofit2.http.GET

interface ApiService {

    @GET("Activities")
    suspend fun getUsers(): Response<ArrayList<ActivityData>>
}