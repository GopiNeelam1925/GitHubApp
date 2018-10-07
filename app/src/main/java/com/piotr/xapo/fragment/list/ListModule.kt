package com.piotr.xapo.fragment.list

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.dao.DaoRepository
import dagger.Provides


@dagger.Module
class ListModule(val view: Contract.View) {

    @Provides
    fun providePresenter(api: GitHubApi,repository: DaoRepository): Contract.Presenter {
        return ListPresenter(view,api,repository)
    }

    @Provides
    fun provideView(): Contract.View {
        return view
    }
}