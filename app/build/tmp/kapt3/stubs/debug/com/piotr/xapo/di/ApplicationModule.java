package com.piotr.xapo.di;

import java.lang.System;

/**
 * * Singleton instances shared across whole application
 */
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0017J\b\u0010\u000b\u001a\u00020\fH\u0017J\b\u0010\r\u001a\u00020\u0003H\u0007J\b\u0010\u000e\u001a\u00020\nH\u0017R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/piotr/xapo/di/ApplicationModule;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "getApplication", "()Landroid/app/Application;", "getDaoRepository", "Lcom/piotr/xapo/dao/DaoRepository;", "myRoomDatabase", "Lcom/piotr/xapo/dao/MyRoomDatabase;", "getGitHubApi", "Lcom/piotr/xapo/api/GitHubApi;", "provideApplication", "provideMyRoomDatabase", "app_debug"})
@dagger.Module()
public class ApplicationModule {
    @org.jetbrains.annotations.NotNull()
    private final android.app.Application application = null;
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.app.Application provideApplication() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public com.piotr.xapo.api.GitHubApi getGitHubApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public com.piotr.xapo.dao.MyRoomDatabase provideMyRoomDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public com.piotr.xapo.dao.DaoRepository getDaoRepository(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.dao.MyRoomDatabase myRoomDatabase) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.app.Application getApplication() {
        return null;
    }
    
    public ApplicationModule(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        super();
    }
}