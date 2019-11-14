package com.eduardolwx.androidxt.extensions

import android.view.View

fun View.invisibleUnless(isVisible: Boolean) {
    if (isVisible) {
        visibility = View.VISIBLE
    } else {
        visibility = View.INVISIBLE
    }
}

fun View.goneUnless(isVisible: Boolean) {
    if (isVisible) {
        visibility = View.VISIBLE
    } else {
        visibility = View.GONE
    }
}
