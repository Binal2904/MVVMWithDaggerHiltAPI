package com.demo.advanced.daggerhilt.util

import android.util.Log
import com.demo.advanced.daggerhilt.BuildConfig

class Debugger {

    companion object {
        private const val TAG = "AdvanceDraggerHilt"
        fun logE(message: String?) {
            if (BuildConfig.DEBUG) Log.e(TAG, message!!)
        }

        fun logE(tag: String, message: String) {
            if (BuildConfig.DEBUG) Log.e(TAG, "$tag ---->>> $message")
        }

        fun logD(message: String?) {
            if (BuildConfig.DEBUG) Log.d(TAG, message!!)
        }

        fun logD(tag: String, message: String) {
            if (BuildConfig.DEBUG) Log.d(TAG, "$tag ---->>> $message")
        }

        fun logI(message: String?) {
            if (BuildConfig.DEBUG) Log.i(TAG, message!!)
        }

        fun logI(tag: String, message: String) {
            if (BuildConfig.DEBUG) Log.i(TAG, "$tag ---->>>  $message")
        }
    }
}