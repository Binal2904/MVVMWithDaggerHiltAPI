package com.demo.advanced.daggerhilt.preference;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0007J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/demo/advanced/daggerhilt/preference/SharedPreferenceManager;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "(Landroid/content/SharedPreferences;)V", "mGetSaveLoginUserData", "", "mLogout", "", "mSaveLoginUserData", "mLoginUserData", "app_stagingDebug"})
public final class SharedPreferenceManager {
    private final android.content.SharedPreferences sharedPreferences = null;
    
    @javax.inject.Inject()
    public SharedPreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.SharedPreferences sharedPreferences) {
        super();
    }
    
    public final void mSaveLoginUserData(@org.jetbrains.annotations.NotNull()
    java.lang.String mLoginUserData) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String mGetSaveLoginUserData() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CommitPrefEdits"})
    public final void mLogout() {
    }
}