package com.example.brayany.completeexampleunittest.FirstActivity

/**
 * Created by brayany on 3/25/2018.
 */
interface MainContract {
    interface View {
        fun showClickText()

    }

    interface UserAction {
        fun createTopic(view: View)
        fun getHello():String
    }
}