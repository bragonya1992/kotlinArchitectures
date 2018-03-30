package com.example.brayany.completeexampleunittest.DaggerFiles

import com.example.brayany.completeexampleunittest.FirstActivity.MAPresenter
import com.example.brayany.completeexampleunittest.interfaces.MainContract
import dagger.Module
import dagger.Provides

/**
 * Created by brayany on 3/29/2018.
 */
@Module
class MainActivityModule {
    @Provides
    fun provideMainPresenter() : MainContract.UserAction {
        return MAPresenter()
    }
}