package com.eduardolwx.kotlinxt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.eduardolwx.kotlinxt.ui.second.SecondFragment

class Second : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SecondFragment.newInstance())
                .commitNow()
        }
    }
}
