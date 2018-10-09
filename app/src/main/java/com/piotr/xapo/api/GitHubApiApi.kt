package com.piotr.xapo.api

import com.piotr.xapo.model.Repository
import retrofit2.http.GET
import io.reactivex.Observable

public interface GitHubApiApi {

    @GET("repositories?language=kotlin")
    fun getRepositories(): Observable<List<Repository>>

}
                