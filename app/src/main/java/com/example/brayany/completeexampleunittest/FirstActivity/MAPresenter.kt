package com.example.brayany.completeexampleunittest.FirstActivity

/**
 * Created by brayany on 3/31/2018.
 */

class MAPresenter: MainContract.UserAction {
    override fun createTopic(view: MainContract.View) {
        view.showClickText()
    }
}