package com.piotr.xapo

import com.piotr.xapo.di.ApplicationComponent
import com.piotr.xapo.di.DaggerApplicationComponent

/**
 * Created by piotr on 10/9/18.
 */
class TestMyApplication : MyApplication() {
    private lateinit var appComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerApplicationComponent.builder().applicationModule(TestApplicationModule(this)).build()
        appComponent.inject(this)

    }
    override fun getAppComponent() = appComponent;

    companion object {
        lateinit var instance: TestMyApplication private set
    }

}