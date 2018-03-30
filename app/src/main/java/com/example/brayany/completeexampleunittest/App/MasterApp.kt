package com.example.brayany.completeexampleunittest.App

import android.app.Activity
import android.app.Application
import com.example.brayany.completeexampleunittest.App.DaggerAppComponent
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by brayany on 3/29/2018.
 */
class MasterApp: Application(), HasActivityInjector {
    @Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector() =  dispatchingActivityInjector

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}
