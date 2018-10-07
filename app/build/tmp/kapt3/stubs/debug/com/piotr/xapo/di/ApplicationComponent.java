package com.piotr.xapo.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/piotr/xapo/di/ApplicationComponent;", "", "daoRepository", "Lcom/piotr/xapo/dao/DaoRepository;", "gitHubApi", "Lcom/piotr/xapo/api/GitHubApi;", "inject", "", "myApplication", "Lcom/piotr/xapo/MyApplication;", "app_debug"})
@dagger.Component(modules = {com.piotr.xapo.di.ApplicationModule.class})
@javax.inject.Singleton()
public abstract interface ApplicationComponent {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.piotr.xapo.dao.DaoRepository daoRepository();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.piotr.xapo.api.GitHubApi gitHubApi();
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.MyApplication myApplication);
}