package com.piotr.xapo.base

import io.reactivex.disposables.Disposable

interface BaseContract {

    interface View {}
    interface Presenter {
        fun subscribe(disposable: Disposable)
        fun dispose()
        fun attach()
    }

}