package com.piotr.xapo

import android.app.Application
import android.content.Context
import android.support.test.runner.AndroidJUnitRunner

/**
 * Created by piotr on 10/9/18.
 */

public class CustomTestRunner : AndroidJUnitRunner() {

    @Throws(InstantiationException::class, IllegalAccessException::class, ClassNotFoundException::class)
    override fun newApplication(classLoader: ClassLoader, className: String, context: Context): Application {
        // replace Application class with mock one
        return super.newApplication(classLoader, TestMyApplication::class.java.name, context)
    }

}