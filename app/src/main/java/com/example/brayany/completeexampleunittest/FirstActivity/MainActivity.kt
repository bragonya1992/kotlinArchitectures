package com.example.brayany.completeexampleunittest.FirstActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.brayany.completeexampleunittest.R
import kotlinx.android.synthetic.main.activity_main.*
import org.koin.android.architecture.ext.viewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity(), MainContract.View {
    val myViewModel : MAViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener({ myViewModel.createTopic(this) })
    }

    override fun showClickText() {
        text.text = "press fab button"
    }
}
