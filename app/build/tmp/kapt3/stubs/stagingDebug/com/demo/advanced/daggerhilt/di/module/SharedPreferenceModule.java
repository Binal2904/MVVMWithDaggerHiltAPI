package com.demo.advanced.daggerhilt.di.module;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\b\u0010\f\u001a\u00020\bH\u0007\u00a8\u0006\r"}, d2 = {"Lcom/demo/advanced/daggerhilt/di/module/SharedPreferenceModule;", "", "()V", "provideSharePreference", "Landroid/content/SharedPreferences;", "context", "Landroid/content/Context;", "sharedPreferenceName", "", "mode", "", "provideSharedPreferenceMode", "provideSharedPreferenceName", "app_stagingDebug"})
@dagger.Module()
public final class SharedPreferenceModule {
    
    public SharedPreferenceModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final java.lang.String provideSharedPreferenceName() {
        return null;
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    public final int provideSharedPreferenceMode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.SharedPreferences provideSharePreference(@org.jetbrains.annotations.NotNull()
    @dagger.hilt.android.qualifiers.ApplicationContext()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String sharedPreferenceName, int mode) {
        return null;
    }
}