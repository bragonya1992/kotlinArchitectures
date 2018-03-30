package com.example.brayany.completeexampleunittest.FirstActivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.brayany.completeexampleunittest.R
import com.example.brayany.completeexampleunittest.interfaces.MainContract
import dagger.android.AndroidInjection
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity(),MainContract.View {
    @Inject lateinit var userAction: MainContract.UserAction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AndroidInjection.inject(this)
        fab.setOnClickListener { userAction.createTopic(this) }
    }

    override fun showClickText() {
        text.text = "press fab button"
    }
}
