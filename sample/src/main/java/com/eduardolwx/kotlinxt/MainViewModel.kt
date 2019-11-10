package com.eduardolwx.kotlinxt

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.eduardolwx.androidxt.extensions.lifecycle.mutableLiveData

class MainViewModel: ViewModel() {

    private val _strData = mutableLiveData("First Value")
    val strData: LiveData<String> = _strData

}