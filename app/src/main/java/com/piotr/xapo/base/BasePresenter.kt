package com.piotr.xapo.base

import io.reactivex.disposables.CompositeDisposable
import io.reactivex.disposables.Disposable

public open class BasePresenter() : BaseContract.Presenter {
    override fun attach() {
    }

    private val subscriptions = CompositeDisposable()
    override fun dispose() {
        subscriptions.clear()
    }

    override fun subscribe(disposable: Disposable) {
        subscriptions.add(disposable)
    }

}