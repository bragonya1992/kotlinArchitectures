package com.example.brayany.completeexampleunittest.FirstActivity

import com.example.brayany.completeexampleunittest.interfaces.MainContract

/**
 * Created by brayany on 3/29/2018.
 */

class MAPresenter: MainContract.UserAction {
    override fun sayHello(): String {
        return "hello"
    }

    override fun createTopic(view: MainContract.View) {
        view.showClickText()
    }
}
