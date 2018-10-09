package com.piotr.xapo

import com.piotr.xapo.api.GitHubApi
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

public class TestGitHubApi : GitHubApi() {

    companion object {
        private var instance: TestGitHubApi? = null
        fun getInstance(): GitHubApi = instance ?: TestGitHubApi()
    }

    override fun getUsers(): Observable<List<User>> = Observable.just(TestValues.getTestUsers()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())

}