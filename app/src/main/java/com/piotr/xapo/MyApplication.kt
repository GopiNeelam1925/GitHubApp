package com.piotr.xapo

import com.piotr.xapo.di.ApplicationComponent
import android.app.Application
import com.piotr.xapo.di.ApplicationModule
import com.piotr.xapo.di.DaggerApplicationComponent

public open class MyApplication : Application() {

    private lateinit var appComponent: ApplicationComponent
    override fun onCreate() {
        super.onCreate()
        instance = this
        appComponent = DaggerApplicationComponent.builder().applicationModule(ApplicationModule(this)).build()
        appComponent.inject(this)

    }
    open fun getAppComponent() = appComponent;

    companion object {
        lateinit var instance: MyApplication private set
    }

}
                