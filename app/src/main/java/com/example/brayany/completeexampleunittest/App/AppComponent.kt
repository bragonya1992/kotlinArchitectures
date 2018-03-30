package com.example.brayany.completeexampleunittest.App

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule

/**
 * Created by brayany on 3/29/2018.
 */

@Component(modules = [AndroidInjectionModule::class,ActivityBuilder::class])
interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent

    }

    fun inject(app: MasterApp)

}