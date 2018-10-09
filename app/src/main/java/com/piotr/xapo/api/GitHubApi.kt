package com.piotr.xapo.api

import retrofit2.Retrofit
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import com.piotr.xapo.model.Repository
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor


public open class GitHubApi {

    private var api: GitHubApiApi

    init {
        val interceptor = HttpLoggingInterceptor()
        interceptor.level = HttpLoggingInterceptor.Level.BODY
        val client = OkHttpClient.Builder().addInterceptor(interceptor).build()

        val gson: Gson = GsonBuilder().setDateFormat("yyyy-MM-dd'T'HH:mm:ssZ").create()
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("    https://github-trending-api.now.sh/")
                .client(client)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build()
        api = retrofit.create(
                GitHubApiApi::class.java)

    }

    open fun getRepositories(): Observable<List<Repository>> = api.getRepositories().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())


}
                