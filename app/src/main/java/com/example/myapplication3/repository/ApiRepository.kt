package com.example.myapplication3.repository

import com.example.myapplication3.net.api.Api
import com.example.myapplication3.net.base.ApiCall
import javax.inject.Inject

class ApiRepository @Inject constructor(private val api: Api) : ApiCall() {
    suspend fun search(q: String?) = call {
        api.search(q)
    }
}