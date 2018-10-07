package com.piotr.xapo

import android.app.Application
import android.arch.persistence.room.Room
import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.dao.MyRoomDatabase
import com.piotr.xapo.di.ApplicationModule
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 *
 * Provides mock dependenceis which later can be used in Espresso test
 *
 */

@Module
public class TestApplicationModule(application: Application) : ApplicationModule(application) {


    @Provides
    @Singleton
    override fun getGitHubApi(): GitHubApi {
        return TestGitHubApi.getInstance()
    }


    @Provides
    @Singleton
    override fun provideMyRoomDatabase(): MyRoomDatabase {
        return Room.inMemoryDatabaseBuilder(application, MyRoomDatabase::class.java).build()
    }


    @Provides
    @Singleton
    override fun getDaoRepository(myRoomDatabase: MyRoomDatabase): DaoRepository {
        return DaoRepository(myRoomDatabase)
    }

}
