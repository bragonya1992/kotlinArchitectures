package com.example.brayany.completeexampleunittest

import android.test.MoreAsserts.assertEquals
import com.example.brayany.completeexampleunittest.FirstActivity.MainContract
import com.example.brayany.completeexampleunittest.FirstActivity.moduleMA
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.koin.standalone.StandAloneContext.closeKoin
import org.koin.standalone.StandAloneContext.startKoin
import org.koin.standalone.inject
import org.koin.test.KoinTest

/**
 * Created by brayany on 4/1/2018.
 */
class Test : KoinTest {

    val presenter : MainContract.UserAction by inject()

    @Before
    fun before(){
        startKoin(listOf(moduleMA))
    }

    @After
    fun after(){
        closeKoin()
    }

    @Test
    fun clickOnFabCallToCreateTopic() {

    }
}