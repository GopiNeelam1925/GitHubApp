package com.piotr.xapo.api

import com.piotr.xapo.model.User
import retrofit2.Retrofit
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

public open class GitHubApi {


    private var api: GitHubApiApi

    init {
        val gson: Gson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create()
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("https://api.github.com/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        api = retrofit.create(
                GitHubApiApi::class.java)
    }

    companion object {
        private var instance: GitHubApi? = null
        fun getInstance(): GitHubApi = instance ?: GitHubApi()
    }

    open fun getUsers(): Observable<List<User>> = api.getUsers().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())


}
                