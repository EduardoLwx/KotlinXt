package com.eduardolwx.androidxt.lifecycle

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun <T> LifecycleOwner.onChange(data: LiveData<T>, observe: ((T) -> Unit)) {
    data.observe(this, Observer<T>(observe))
}
