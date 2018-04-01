package com.example.brayany.completeexampleunittest.FirstActivity

import android.arch.lifecycle.ViewModel

/**
 * Created by brayany on 4/1/2018.
 */
class MAViewModel(val model: MainContract.UserAction): ViewModel() {

    fun createTopic(contract: MainContract.View) = model.createTopic(contract)
}