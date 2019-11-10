package com.eduardolwx.androidxt.extensions.lifecycle

import androidx.lifecycle.MutableLiveData

fun <T> mutableLiveData(initData: T) : MutableLiveData<T> {
    return MutableLiveData<T>().apply {
        value = initData
    }
}