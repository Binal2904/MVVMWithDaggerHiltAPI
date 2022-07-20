package com.demo.advanced.daggerhilt.di.module

import com.demo.advanced.daggerhilt.di.qualifier.*
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class ApiModule {

    @ApiUrl
    @Singleton
    @Provides
    fun provideApiUrl(): String = BuildConfig.BASE_URL

    @Provides
    @Singleton
    @ApiHttpLogger
    fun provideHttpLoggingInterceptor(): HttpLoggingInterceptor {
        val mInterceptor = HttpLoggingInterceptor()
        mInterceptor.level = HttpLoggingInterceptor.Level.BODY
        return mInterceptor
    }

    @Provides
    @Singleton
    @ApiHttpClient
    fun provideOkHttpClient(@ApiHttpLogger loggingInterceptor: HttpLoggingInterceptor): OkHttpClient {
        return OkHttpClient.Builder().readTimeout(100, TimeUnit.MILLISECONDS)
            .connectTimeout(100, TimeUnit.MILLISECONDS).addInterceptor(loggingInterceptor).build()
    }

    @Provides
    @Singleton
    @ApiUrlGson
    fun setGson() = GsonBuilder().setLenient().create()

    @Provides
    @Singleton
    @ApiRetrofit
    fun provideRetrofit(
        @ApiHttpClient okHttpClient: OkHttpClient,
        @ApiUrlGson gson: Gson,
        @ApiUrl baseUrl: String
    ): Retrofit =
        Retrofit.Builder().addConverterFactory(GsonConverterFactory.create(gson)).baseUrl(baseUrl)
            .client(okHttpClient).build()


    @Provides
    @Singleton
    @ApiService
    fun provideApiService(@ApiRetrofit retrofit: Retrofit): com.demo.advanced.daggerhilt.restfullapi.ApiService =
        retrofit.create(com.demo.advanced.daggerhilt.restfullapi.ApiService::class.java)
}