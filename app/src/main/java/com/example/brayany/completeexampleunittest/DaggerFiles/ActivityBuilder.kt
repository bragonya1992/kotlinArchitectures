package com.example.brayany.completeexampleunittest.DaggerFiles

import com.example.brayany.completeexampleunittest.FirstActivity.MainActivity
import dagger.Module

/**
 * Created by brayany on 3/29/2018.
 */
@Module
abstract class ActivityBuilder {
    //@ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity
}