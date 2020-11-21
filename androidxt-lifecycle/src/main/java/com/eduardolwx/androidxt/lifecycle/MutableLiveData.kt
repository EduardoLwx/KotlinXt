package com.eduardolwx.androidxt.lifecycle

import androidx.lifecycle.MutableLiveData

fun <T> mutableLiveData(initData: T): MutableLiveData<T> {
    return MutableLiveData<T>().apply {
        value = initData
    }
}