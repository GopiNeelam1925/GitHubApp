package com.piotr.xapo.di;

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.MyApplication
import com.piotr.xapo.dao.DaoRepository
import javax.inject.Singleton
import dagger.Component

@Singleton
@Component(modules = arrayOf(ApplicationModule::class))
public interface ApplicationComponent {

    fun daoRepository() : DaoRepository
    fun gitHubApi(): GitHubApi
    fun inject(myApplication: MyApplication)

}
                