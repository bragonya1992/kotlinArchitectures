package com.example.brayany.completeexampleunittest

import android.app.Activity
import android.app.Application
import com.example.brayany.completeexampleunittest.DaggerFiles.DaggerAppComponent
import javax.inject.Inject

/**
 * Created by brayany on 3/29/2018.
 */
class MasterApp: Application(), HasActivityInjector {
    //@Inject lateinit var dispatchingActivityInjector: DispatchingAndroidInjector<Activity>
    override fun activityInjector() =  print("hello")

    override fun onCreate() {
        super.onCreate()
        DaggerAppComponent.builder().application(this).build().inject(this)
    }
}

interface HasActivityInjector {
    fun activityInjector()
}
