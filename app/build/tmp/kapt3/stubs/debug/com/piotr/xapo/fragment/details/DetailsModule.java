package com.piotr.xapo.fragment.details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\b\u0010\r\u001a\u00020\u0003H\u0007R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lcom/piotr/xapo/fragment/details/DetailsModule;", "", "view", "Lcom/piotr/xapo/fragment/details/Contract$View;", "(Lcom/piotr/xapo/fragment/details/Contract$View;)V", "getView", "()Lcom/piotr/xapo/fragment/details/Contract$View;", "providePresenter", "Lcom/piotr/xapo/fragment/details/Contract$Presenter;", "api", "Lcom/piotr/xapo/api/GitHubApi;", "repository", "Lcom/piotr/xapo/dao/DaoRepository;", "provideView", "app_debug"})
@dagger.Module()
public final class DetailsModule {
    @org.jetbrains.annotations.NotNull()
    private final com.piotr.xapo.fragment.details.Contract.View view = null;
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.piotr.xapo.fragment.details.Contract.Presenter providePresenter(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.api.GitHubApi api, @org.jetbrains.annotations.NotNull()
    com.piotr.xapo.dao.DaoRepository repository) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.piotr.xapo.fragment.details.Contract.View provideView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.fragment.details.Contract.View getView() {
        return null;
    }
    
    public DetailsModule(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.fragment.details.Contract.View view) {
        super();
    }
}