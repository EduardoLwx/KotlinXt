package com.eduardolwx.kotlinxt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eduardolwx.androidxt.extensions.lifecycle.getViewModel
import com.eduardolwx.androidxt.extensions.lifecycle.onChange

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = getViewModel(MainViewModel::class.java)

        onChange(viewModel.strData) {
            t -> Log.d("------ UPDATE STRING", t)
        }
    }
}
