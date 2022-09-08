package com.example.myapplication3.net.api

import com.example.myapplication3.models.SearchModel
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET
    suspend fun search(
        @Query("q") q: String?
    ): SearchModel?
}