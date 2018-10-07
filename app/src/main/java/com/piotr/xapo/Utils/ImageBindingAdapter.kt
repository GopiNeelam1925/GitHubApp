package com.piotr.xapo.Utils

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.piotr.xapo.R

object ImageBindingAdapter {
    @JvmStatic
    @BindingAdapter("android:src")
    fun setImageUrl(view: ImageView, url: String) {
        Glide.with(view.context)
                .load(url)
                .apply(RequestOptions().override(120,120))
                .apply(RequestOptions().placeholder(R.drawable.placeholder))
                .into(view)
    }
}