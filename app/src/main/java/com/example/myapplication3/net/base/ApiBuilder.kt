package com.example.myapplication3.net.base

import javax.inject.Inject

class ApiBuilder @Inject constructor() {
    fun <Api> buildApi(api: Class<Api>): Api {
        return RetrofitBuilder.retrofit().create(api)
    }
}