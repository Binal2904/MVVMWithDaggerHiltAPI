// Generated by Dagger (https://dagger.dev).
package com.demo.advanced.daggerhilt.di.module;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata("com.demo.advanced.daggerhilt.di.qualifier.ApiUrlGson")
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiModule_SetGsonFactory implements Factory<Gson> {
  private final ApiModule module;

  public ApiModule_SetGsonFactory(ApiModule module) {
    this.module = module;
  }

  @Override
  public Gson get() {
    return setGson(module);
  }

  public static ApiModule_SetGsonFactory create(ApiModule module) {
    return new ApiModule_SetGsonFactory(module);
  }

  public static Gson setGson(ApiModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.setGson());
  }
}
