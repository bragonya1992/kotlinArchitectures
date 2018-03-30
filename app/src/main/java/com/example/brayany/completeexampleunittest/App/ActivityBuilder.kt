package com.example.brayany.completeexampleunittest.App

import com.example.brayany.completeexampleunittest.FirstActivity.MainActivity
import com.example.brayany.completeexampleunittest.FirstActivity.MainActivityModule
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by brayany on 3/29/2018.
 */
@Module
abstract class ActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    internal abstract fun bindMainActivity(): MainActivity
}