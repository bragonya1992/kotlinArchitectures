package com.example.brayany.completeexampleunittest

import android.app.Activity
import android.content.Context
import android.support.test.InstrumentationRegistry
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import com.example.brayany.completeexampleunittest.App.MasterApp
import com.example.brayany.completeexampleunittest.App.MasterApp_MembersInjector
import com.example.brayany.completeexampleunittest.FirstActivity.MAPresenter
import com.example.brayany.completeexampleunittest.FirstActivity.MainActivity
import com.example.brayany.completeexampleunittest.interfaces.MainContract
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.DispatchingAndroidInjector_Factory

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Rule
import javax.inject.Provider

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class MainViewTests {
    val mockUserAction = MAPresenter()

    @get:Rule
    val activityTestRule = object : ActivityTestRule<MainActivity>(MainActivity::class.java, true, true) {
        override fun beforeActivityLaunched() {
            super.beforeActivityLaunched()
            val myApp = InstrumentationRegistry.getTargetContext().applicationContext as MasterApp
            myApp.dispatchingActivityInjector = createFakeMainActivityInjector {
                userAction = mockUserAction
            }
        }
    }

    @Test
    fun clickOnFabCallToCreateTopic() {
        onView(withId(R.id.fab)).perform(click())

        //(mockUserAction).createTopic(view = activityTestRule.activity)
    }

    fun createFakeMainActivityInjector(block : MainActivity.() -> Unit)
            : DispatchingAndroidInjector<Activity> {
        val injector = AndroidInjector<Activity> { instance ->
            if (instance is MainActivity) {
                instance.block()
            }
        }
        val factory = AndroidInjector.Factory<Activity> { injector }
        val map = mapOf(Pair<Class <out Activity>,
                Provider<AndroidInjector.Factory<out Activity>>>(MainActivity::class.java, Provider { factory }))
        return DispatchingAndroidInjector_Factory.newDispatchingAndroidInjector(map)
    }
}
