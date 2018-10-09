package com.piotr.xapo.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/piotr/xapo/api/GitHubApiApi;", "", "getRepositories", "Lio/reactivex/Observable;", "", "Lcom/piotr/xapo/model/Repository;", "app_debug"})
public abstract interface GitHubApiApi {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "repositories?language=kotlin")
    public abstract io.reactivex.Observable<java.util.List<com.piotr.xapo.model.Repository>> getRepositories();
}