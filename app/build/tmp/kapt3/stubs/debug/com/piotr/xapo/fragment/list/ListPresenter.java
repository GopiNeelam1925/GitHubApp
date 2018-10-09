package com.piotr.xapo.fragment.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0016\u0010\u0019\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002J\u0016\u0010\u001d\u001a\u00020\u00172\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001f"}, d2 = {"Lcom/piotr/xapo/fragment/list/ListPresenter;", "Lcom/piotr/xapo/base/BasePresenter;", "Lcom/piotr/xapo/fragment/list/Contract$Presenter;", "view", "Lcom/piotr/xapo/fragment/list/Contract$View;", "gitHubApi", "Lcom/piotr/xapo/api/GitHubApi;", "repository", "Lcom/piotr/xapo/dao/DaoRepository;", "(Lcom/piotr/xapo/fragment/list/Contract$View;Lcom/piotr/xapo/api/GitHubApi;Lcom/piotr/xapo/dao/DaoRepository;)V", "getGitHubApi", "()Lcom/piotr/xapo/api/GitHubApi;", "setGitHubApi", "(Lcom/piotr/xapo/api/GitHubApi;)V", "getRepository", "()Lcom/piotr/xapo/dao/DaoRepository;", "setRepository", "(Lcom/piotr/xapo/dao/DaoRepository;)V", "getView", "()Lcom/piotr/xapo/fragment/list/Contract$View;", "setView", "(Lcom/piotr/xapo/fragment/list/Contract$View;)V", "loadData", "", "restoreData", "setData", "Repositorys", "", "Lcom/piotr/xapo/model/Repository;", "storeData", "repositories", "app_debug"})
public final class ListPresenter extends com.piotr.xapo.base.BasePresenter implements com.piotr.xapo.fragment.list.Contract.Presenter {
    @org.jetbrains.annotations.NotNull()
    private com.piotr.xapo.fragment.list.Contract.View view;
    @org.jetbrains.annotations.NotNull()
    private com.piotr.xapo.api.GitHubApi gitHubApi;
    @org.jetbrains.annotations.NotNull()
    private com.piotr.xapo.dao.DaoRepository repository;
    
    private final void setData(java.util.List<com.piotr.xapo.model.Repository> Repositorys) {
    }
    
    private final void storeData(java.util.List<com.piotr.xapo.model.Repository> repositories) {
    }
    
    @java.lang.Override()
    public void restoreData() {
    }
    
    @java.lang.Override()
    public void loadData() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.fragment.list.Contract.View getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.fragment.list.Contract.View p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.api.GitHubApi getGitHubApi() {
        return null;
    }
    
    public final void setGitHubApi(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.api.GitHubApi p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.dao.DaoRepository getRepository() {
        return null;
    }
    
    public final void setRepository(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.dao.DaoRepository p0) {
    }
    
    @javax.inject.Inject()
    public ListPresenter(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.fragment.list.Contract.View view, @org.jetbrains.annotations.NotNull()
    com.piotr.xapo.api.GitHubApi gitHubApi, @org.jetbrains.annotations.NotNull()
    com.piotr.xapo.dao.DaoRepository repository) {
        super();
    }
}