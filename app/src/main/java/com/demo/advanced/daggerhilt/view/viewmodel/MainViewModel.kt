package com.demo.advanced.daggerhilt.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.demo.advanced.daggerhilt.data.response.ActivityData
import com.demo.advanced.daggerhilt.repository.MainRepository
import com.demo.advanced.daggerhilt.util.NetworkHelper
import com.demo.advanced.daggerhilt.util.ApiResource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val mainRepository: MainRepository,
    private val networkHelper: NetworkHelper
) :
    ViewModel() {

    private val mGetMutableActivityData = MutableLiveData<ApiResource<ArrayList<ActivityData>>>()
    val mActivityDataList: LiveData<ApiResource<ArrayList<ActivityData>>> get() = mGetMutableActivityData

    init {
        mGetActivityData()
    }

    private fun mGetActivityData() {
        viewModelScope.launch {
            mGetMutableActivityData.postValue(ApiResource.loading(null))
            if (networkHelper.isNetworkConnected()) {
                mainRepository.getUsers().let {
                    if (it.isSuccessful) {
                        mGetMutableActivityData.postValue(ApiResource.success(it.body()))
                    } else
                        mGetMutableActivityData.postValue(
                            ApiResource.error(
                                it.errorBody().toString(),
                                null
                            )
                        )
                }
            } else {
                mGetMutableActivityData.postValue(
                    ApiResource.error(
                        "No Active Internet Connection",
                        null
                    )
                )
            }
        }
    }
}