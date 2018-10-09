package com.piotr.xapo.dao;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ \u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\r"}, d2 = {"Lcom/piotr/xapo/dao/DaoRepository;", "", "myRoomDatabase", "Lcom/piotr/xapo/dao/MyRoomDatabase;", "(Lcom/piotr/xapo/dao/MyRoomDatabase;)V", "getMyRoomDatabase", "()Lcom/piotr/xapo/dao/MyRoomDatabase;", "laodRepositories", "Lio/reactivex/Observable;", "", "Lcom/piotr/xapo/model/Repository;", "saveRepositories", "repositories", "app_debug"})
public final class DaoRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.piotr.xapo.dao.MyRoomDatabase myRoomDatabase = null;
    
    /**
     * * Because trending repositories changes often we don`t store them permanently.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.piotr.xapo.model.Repository>> saveRepositories(@org.jetbrains.annotations.NotNull()
    java.util.List<com.piotr.xapo.model.Repository> repositories) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Observable<java.util.List<com.piotr.xapo.model.Repository>> laodRepositories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.dao.MyRoomDatabase getMyRoomDatabase() {
        return null;
    }
    
    public DaoRepository(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.dao.MyRoomDatabase myRoomDatabase) {
        super();
    }
}