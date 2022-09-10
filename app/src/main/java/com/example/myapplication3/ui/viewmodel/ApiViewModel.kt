package com.example.myapplication3.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.myapplication3.models.SearchModel
import com.example.myapplication3.net.base.ApiCallResult
import com.example.myapplication3.repository.ApiRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ApiViewModel @Inject constructor(private val repository: ApiRepository) : ViewModel() {
    private val _searchFlow = MutableStateFlow<ApiCallResult<SearchModel?>?>(null)
    val searchFlow = _searchFlow.asStateFlow()

    suspend fun search(q: String?) = viewModelScope.launch {
        _searchFlow.value = ApiCallResult.Loading()
        _searchFlow.value = repository.search(q)
    }
}