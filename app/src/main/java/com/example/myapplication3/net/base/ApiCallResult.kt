package com.example.myapplication3.net.base

sealed class ApiCallResult<out T> {
    data class Success<out T>(val value: T): ApiCallResult<T>()
    data class Failure(
        val isNetworkError: Boolean,
        val errorCode: Int,
        val errorBody: Any?
    ): ApiCallResult<Nothing>()
    open class Loading: ApiCallResult<Nothing>()
}