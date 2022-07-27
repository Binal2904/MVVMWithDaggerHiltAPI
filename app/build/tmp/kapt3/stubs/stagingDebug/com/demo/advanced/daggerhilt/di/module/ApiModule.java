package com.demo.advanced.daggerhilt.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\nH\u0007J&\u0010\u000e\u001a\u00020\u00062\b\b\u0001\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u0012\u001a\u00020\bH\u0007J\u0010\u0010\u0013\u001a\n \u0014*\u0004\u0018\u00010\u00110\u0011H\u0007\u00a8\u0006\u0015"}, d2 = {"Lcom/demo/advanced/daggerhilt/di/module/ApiModule;", "", "()V", "provideApiService", "Lcom/demo/advanced/daggerhilt/restfullapi/ApiService;", "retrofit", "Lretrofit2/Retrofit;", "provideApiUrl", "", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "loggingInterceptor", "provideRetrofit", "okHttpClient", "gson", "Lcom/google/gson/Gson;", "baseUrl", "setGson", "kotlin.jvm.PlatformType", "app_stagingDebug"})
@dagger.Module()
public final class ApiModule {
    
    public ApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiUrl()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final java.lang.String provideApiUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiHttpLogger()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiHttpClient()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiHttpLogger()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    @com.demo.advanced.daggerhilt.di.qualifier.ApiUrlGson()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson setGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiRetrofit()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofit(@org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiHttpClient()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiUrlGson()
    com.google.gson.Gson gson, @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiUrl()
    java.lang.String baseUrl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.BaseApiService()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.advanced.daggerhilt.restfullapi.ApiService provideApiService(@org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.ApiRetrofit()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}