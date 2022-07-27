package com.demo.advanced.daggerhilt.repository

import com.demo.advanced.daggerhilt.restfullapi.ApiService
import javax.inject.Inject

class MainRepository(private val apiHelper: ApiService) {

    suspend fun getUsers() = apiHelper.getUsers()
}