package com.example.myapplication3.models

import com.google.gson.annotations.SerializedName

class SearchModel {
    @SerializedName("items")
    val items: ArrayList<Item>? = null

    data class Item(
        @SerializedName("id")
        val id: Long,
        @SerializedName("full_name")
        val fullName: String? = null,
        @SerializedName("html_url")
        val htmlUrl: String? = null,
        @SerializedName("description")
        val description: String? = null,
        @SerializedName("language")
        val language: String? = null,
    )
}