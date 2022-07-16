package com.demo.advanced.daggerhilt.util

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.demo.advanced.daggerhilt.R
import com.google.android.material.snackbar.Snackbar

class Utility {

    companion object {
        fun isNotNullOrEmpty(string: String?): Boolean {
            return string != null && string.isNotEmpty()

        }

        fun loadImageUsingGlide(
            context: Context, imageView: ImageView?, url: String?
        ) {
            val activity = context as Activity
            if (activity.isDestroyed) {
                return
            }
            Glide.with(context).load(url).diskCacheStrategy(DiskCacheStrategy.ALL)
                .skipMemoryCache(true).placeholder(R.mipmap.ic_launcher).fitCenter()
                .error(R.drawable.ic_launcher_background).into(imageView!!)


        }

        fun hideSoftKeyboard(context: Context, view: View) {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }


        private fun messageToast(
            context: Context, view: View, mMessage: String
        ) {
            Snackbar.make(context, view, mMessage, Snackbar.LENGTH_SHORT).show()
        }
    }

}