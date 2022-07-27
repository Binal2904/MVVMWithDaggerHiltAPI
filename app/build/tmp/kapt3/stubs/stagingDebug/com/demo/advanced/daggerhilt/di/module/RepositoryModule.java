package com.demo.advanced.daggerhilt.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/demo/advanced/daggerhilt/di/module/RepositoryModule;", "", "()V", "provideRepositoryModule", "Lcom/demo/advanced/daggerhilt/repository/MainRepository;", "apiService", "Lcom/demo/advanced/daggerhilt/restfullapi/ApiService;", "app_stagingDebug"})
@dagger.Module()
public final class RepositoryModule {
    
    public RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.demo.advanced.daggerhilt.repository.MainRepository provideRepositoryModule(@org.jetbrains.annotations.NotNull()
    @com.demo.advanced.daggerhilt.di.qualifier.BaseApiService()
    com.demo.advanced.daggerhilt.restfullapi.ApiService apiService) {
        return null;
    }
}