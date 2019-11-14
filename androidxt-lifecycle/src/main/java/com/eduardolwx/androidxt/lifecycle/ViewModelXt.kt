package com.eduardolwx.androidxt.lifecycle

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders

fun <T : ViewModel> Fragment.getViewModel(modelClass: Class<T>, fragment: Fragment = this): T {
    return ViewModelProviders.of(fragment).get(modelClass)
}

fun <T : ViewModel> FragmentActivity.getViewModel(modelClass: Class<T>, fragmentActivity: FragmentActivity = this): T {
    return ViewModelProviders.of(fragmentActivity).get(modelClass)
}

fun <T : ViewModel> Fragment.getViewModel(key: String, modelClass: Class<T>, fragment: Fragment = this): T {
    return ViewModelProviders.of(fragment).get(key, modelClass)
}

fun <T : ViewModel> FragmentActivity.getViewModel(key: String, modelClass: Class<T>, fragmentActivity: FragmentActivity = this): T {
    return ViewModelProviders.of(fragmentActivity).get(key, modelClass)
}