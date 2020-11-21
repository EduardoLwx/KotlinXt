package com.eduardolwx.kotlinxt

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.eduardolwx.androidxt.lifecycle.mutableLiveData

class MainViewModel : ViewModel() {

    private val _strData = com.eduardolwx.androidxt.lifecycle.mutableLiveData("First Value")
    val strData: LiveData<String> = _strData
}