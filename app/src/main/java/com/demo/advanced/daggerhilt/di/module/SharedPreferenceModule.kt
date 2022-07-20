package com.demo.advanced.daggerhilt.di.module

import android.content.Context
import android.content.SharedPreferences
import com.demo.advanced.daggerhilt.preference.SHARED_PREF_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class SharedPreferenceModule {

    @Provides
    @Singleton
    fun provideSharedPreferenceName(): String = SHARED_PREF_NAME

    @Provides
    @Singleton
    fun provideSharedPreferenceMode(): Int = Context.MODE_PRIVATE

    @Provides
    @Singleton
    fun provideSharePreference(
        @ApplicationContext context: Context,
        sharedPreferenceName: String,
        mode: Int
    ): SharedPreferences {
        return context.getSharedPreferences(sharedPreferenceName, mode)
    }
}