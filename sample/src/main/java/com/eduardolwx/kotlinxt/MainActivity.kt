package com.eduardolwx.kotlinxt

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.eduardolwx.androidxt.extensions.goneUnless
import com.eduardolwx.androidxt.lifecycle.getViewModel
import com.eduardolwx.androidxt.lifecycle.onChange
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txHello.goneUnless(true)

        viewModel = getViewModel(MainViewModel::class.java)

        onChange(viewModel.strData) {
            t -> Log.d("------ UPDATE STRING", t)
        }
    }
}
