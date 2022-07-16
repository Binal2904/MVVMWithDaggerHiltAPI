package com.demo.advanced.daggerhilt.view.activity

import android.view.LayoutInflater
import com.demo.advanced.daggerhilt.databinding.ActivityMainBinding
import com.demo.advanced.daggerhilt.view.base.BaseActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override fun setBinding(layoutInflater: LayoutInflater): ActivityMainBinding {
        return ActivityMainBinding.inflate(layoutInflater)
    }

    override fun initView() {
        mManageToolbar(binding.includeLayToolbar, "MainActivity", false, 0)
    }
}