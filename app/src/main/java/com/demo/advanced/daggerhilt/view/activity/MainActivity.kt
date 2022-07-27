package com.demo.advanced.daggerhilt.view.activity

import android.view.LayoutInflater
import androidx.activity.viewModels
import com.demo.advanced.daggerhilt.databinding.ActivityMainBinding
import com.demo.advanced.daggerhilt.enum.ApiStatus
import com.demo.advanced.daggerhilt.util.Debugger
import com.demo.advanced.daggerhilt.view.base.BaseActivity
import com.demo.advanced.daggerhilt.view.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>() {

    private val mainViewModel: MainViewModel by viewModels()
    override fun setBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        mManageToolbar(binding.includeLayToolbar, "MainActivity", false, 0, null)
        mSetUpObserver()
    }

    private fun mSetUpObserver() {
        mainViewModel.mActivityDataList.observe(this) {
            when (it.status) {
                ApiStatus.SUCCESS -> {
                    it.data?.let { user ->
                        Debugger.logD(user.toString())
                        messageSnackBar("Api call successfully",binding.root)
                    }
                }
                ApiStatus.LOADING -> {
                    Debugger.logD("Loading")
                    messageSnackBar("Loading please wait...",binding.root)
                }
                ApiStatus.ERROR -> {
                    messageSnackBar(it.message!!, binding.root)
                }
            }
        }
    }
}