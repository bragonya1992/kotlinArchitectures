package com.example.brayany.completeexampleunittest.FirstActivity

import android.view.View
import org.koin.android.architecture.ext.viewModel
import org.koin.dsl.module.Module
import org.koin.dsl.module.applicationContext

/**
 * Created by brayany on 3/31/2018.
 */
val moduleMA = applicationContext {
    factory { MAPresenter() as MainContract.UserAction }
    viewModel { MAViewModel(get()) }

}