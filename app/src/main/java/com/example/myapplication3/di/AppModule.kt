package com.example.myapplication3.di

import com.example.myapplication3.net.api.Api
import com.example.myapplication3.net.base.ApiBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {
    @Provides
    @Singleton
    fun provideApiBuilder(apiBuilder: ApiBuilder): Api {
        return apiBuilder.buildApi(Api::class.java)
    }
}