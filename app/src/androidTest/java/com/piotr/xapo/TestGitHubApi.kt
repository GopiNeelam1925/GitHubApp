package com.piotr.xapo

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.model.Repository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

public class TestGitHubApi : GitHubApi() {

    companion object {
        private var instance: TestGitHubApi? = null
        fun getInstance(): GitHubApi = instance ?: TestGitHubApi()
    }


    override fun getRepositories(): Observable<List<Repository>> {
        val data = TestValues.getTestRepositories()
        return Observable.just(data).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
    }
}