package com.demo.advanced.daggerhilt.preference

import android.annotation.SuppressLint
import android.content.SharedPreferences
import javax.inject.Inject

class SharedPreferenceManager @Inject constructor(private val sharedPreferences: SharedPreferences) {

    fun mSaveLoginUserData(mLoginUserData: String) {
        sharedPreferences.edit().putString("Key", mLoginUserData).apply()
    }

    fun mGetSaveLoginUserData(): String? {
        return sharedPreferences.getString("Key", "defaultValue")
    }

    @SuppressLint("CommitPrefEdits")
    fun mLogout() {
        sharedPreferences.edit().clear()
        sharedPreferences.edit().apply()
    }

}