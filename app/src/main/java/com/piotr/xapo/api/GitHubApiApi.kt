package com.piotr.xapo.api

import retrofit2.http.GET
import com.piotr.xapo.model.User
import io.reactivex.Observable

public interface GitHubApiApi {

    @GET("users")
    fun getUsers(): Observable<List<User>>

}
                