package com.example.brayany.completeexampleunittest.interfaces

/**
 * Created by brayany on 3/25/2018.
 */
interface MainContract {
    interface View {
        fun showClickText()

    }

    interface UserAction {
        fun createTopic(view: View)
        fun sayHello():String
    }
}