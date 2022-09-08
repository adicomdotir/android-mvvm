package com.example.myapplication3.net.base

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.HttpException

abstract class ApiCall {
    suspend fun <T> call(
        callApi: suspend () -> T
    ): ApiCallResult<T> {
        return  withContext(Dispatchers.IO) {
            try {
                ApiCallResult.Success(callApi.invoke())
            } catch (th: Throwable) {
                when(th) {
                    is HttpException -> {
                        ApiCallResult.Failure(false, th.code(), th.response()?.errorBody())
                    }
                    else -> {
                        ApiCallResult.Failure(true, -1, null)
                    }
                }
            }
        }
    }
}