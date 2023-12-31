// Generated by Dagger (https://dagger.dev).
package com.demo.advanced.daggerhilt.view.viewmodel;

import com.demo.advanced.daggerhilt.repository.MainRepository;
import com.demo.advanced.daggerhilt.util.NetworkHelper;
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
public final class MainViewModel_Factory implements Factory<MainViewModel> {
  private final Provider<MainRepository> mainRepositoryProvider;

  private final Provider<NetworkHelper> networkHelperProvider;

  public MainViewModel_Factory(Provider<MainRepository> mainRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    this.mainRepositoryProvider = mainRepositoryProvider;
    this.networkHelperProvider = networkHelperProvider;
  }

  @Override
  public MainViewModel get() {
    return newInstance(mainRepositoryProvider.get(), networkHelperProvider.get());
  }

  public static MainViewModel_Factory create(Provider<MainRepository> mainRepositoryProvider,
      Provider<NetworkHelper> networkHelperProvider) {
    return new MainViewModel_Factory(mainRepositoryProvider, networkHelperProvider);
  }

  public static MainViewModel newInstance(MainRepository mainRepository,
      NetworkHelper networkHelper) {
    return new MainViewModel(mainRepository, networkHelper);
  }
}
