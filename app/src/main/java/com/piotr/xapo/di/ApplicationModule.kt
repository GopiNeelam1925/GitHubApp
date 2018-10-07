package com.piotr.xapo.di

import com.piotr.xapo.api.GitHubApi
import dagger.Provides
import javax.inject.Singleton
import com.piotr.xapo.dao.DaoRepository
import dagger.Module
import android.app.Application
import android.arch.persistence.room.Room
import com.piotr.xapo.dao.MyRoomDatabase

@Module
public open class ApplicationModule(val application: Application) {


    @Provides
    @Singleton
    fun provideApplication(): Application {
        return application
    }
    @Provides
    @Singleton
    open fun getGitHubApi(): GitHubApi {
        return GitHubApi.getInstance()
    }


    @Provides
    @Singleton
    open fun provideMyRoomDatabase(): MyRoomDatabase {
        return Room.databaseBuilder(application, MyRoomDatabase::class.java, MyRoomDatabase.DATABASE_NAME).build()
    }


    @Provides
    @Singleton
    open fun getDaoRepository(myRoomDatabase: MyRoomDatabase): DaoRepository {
        return DaoRepository(myRoomDatabase);
    }

}
                