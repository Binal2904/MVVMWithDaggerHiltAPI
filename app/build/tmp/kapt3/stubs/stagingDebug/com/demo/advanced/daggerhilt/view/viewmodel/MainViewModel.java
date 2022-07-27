package com.demo.advanced.daggerhilt.view.viewmodel;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0011\u001a\u00020\u0012H\u0002R-\u0010\u0007\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f0\t0\b8F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/viewmodel/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/demo/advanced/daggerhilt/repository/MainRepository;", "networkHelper", "Lcom/demo/advanced/daggerhilt/util/NetworkHelper;", "(Lcom/demo/advanced/daggerhilt/repository/MainRepository;Lcom/demo/advanced/daggerhilt/util/NetworkHelper;)V", "mActivityDataList", "Landroidx/lifecycle/LiveData;", "Lcom/demo/advanced/daggerhilt/util/ApiResource;", "Ljava/util/ArrayList;", "Lcom/demo/advanced/daggerhilt/data/response/ActivityData;", "Lkotlin/collections/ArrayList;", "getMActivityDataList", "()Landroidx/lifecycle/LiveData;", "mGetMutableActivityData", "Landroidx/lifecycle/MutableLiveData;", "mGetActivityData", "", "app_stagingDebug"})
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    private final com.demo.advanced.daggerhilt.repository.MainRepository mainRepository = null;
    private final com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper = null;
    private final androidx.lifecycle.MutableLiveData<com.demo.advanced.daggerhilt.util.ApiResource<java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.ActivityData>>> mGetMutableActivityData = null;
    
    @javax.inject.Inject()
    public MainViewModel(@org.jetbrains.annotations.NotNull()
    com.demo.advanced.daggerhilt.repository.MainRepository mainRepository, @org.jetbrains.annotations.NotNull()
    com.demo.advanced.daggerhilt.util.NetworkHelper networkHelper) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.demo.advanced.daggerhilt.util.ApiResource<java.util.ArrayList<com.demo.advanced.daggerhilt.data.response.ActivityData>>> getMActivityDataList() {
        return null;
    }
    
    private final void mGetActivityData() {
    }
}