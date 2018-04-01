package com.example.brayany.completeexampleunittest.App

import android.app.Application
import com.example.brayany.completeexampleunittest.FirstActivity.moduleMA
import org.koin.android.ext.android.startKoin

/**
 * Created by brayany on 3/31/2018.
 */
class MasterApp: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin(this, listOf(moduleMA))
    }
}