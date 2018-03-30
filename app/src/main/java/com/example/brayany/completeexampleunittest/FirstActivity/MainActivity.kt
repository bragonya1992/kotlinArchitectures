package com.example.brayany.completeexampleunittest.FirstActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.brayany.completeexampleunittest.R
import com.example.brayany.completeexampleunittest.interfaces.MainContract
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),MainContract.View {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fab.setOnClickListener({ Log.d("press","fab")})
    }

    override fun showClickText() {
        text.text = "press fab button"
    }
}
