// Generated by Dagger (https://dagger.dev).
package com.demo.advanced.daggerhilt.preference;

import android.content.SharedPreferences;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SharedPreferenceManager_Factory implements Factory<SharedPreferenceManager> {
  private final Provider<SharedPreferences> sharedPreferencesProvider;

  public SharedPreferenceManager_Factory(Provider<SharedPreferences> sharedPreferencesProvider) {
    this.sharedPreferencesProvider = sharedPreferencesProvider;
  }

  @Override
  public SharedPreferenceManager get() {
    return newInstance(sharedPreferencesProvider.get());
  }

  public static SharedPreferenceManager_Factory create(
      Provider<SharedPreferences> sharedPreferencesProvider) {
    return new SharedPreferenceManager_Factory(sharedPreferencesProvider);
  }

  public static SharedPreferenceManager newInstance(SharedPreferences sharedPreferences) {
    return new SharedPreferenceManager(sharedPreferences);
  }
}
