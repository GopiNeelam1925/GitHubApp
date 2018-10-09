package com.piotr.xapo.fragment.list

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.base.BasePresenter
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.model.Repository
import javax.inject.Inject

public class ListPresenter @Inject constructor(
        var view: Contract.View,
        var gitHubApi: GitHubApi,
        var repository: DaoRepository) : BasePresenter(), Contract.Presenter {

    private fun setData(Repositorys: List<Repository>) {
        view.hideProgress()
        view.setAdapterData(Repositorys)
        if (Repositorys.size == 0) {
            view.onNoDataFetched()
        }
    }

    private fun storeData(repositories: List<Repository>) {
        subscribe(repository.saveRepositories(repositories).subscribe { _ ->
            setData(repositories)
        })
    }

    override fun restoreData() {
        subscribe(repository.laodRepositories().subscribe { repositories ->
            setData(repositories)
        })
    }

    override fun loadData() {
        view.showProgress()
        subscribe(gitHubApi.getRepositories().subscribe(
                { result -> storeData(result) },
                { error -> restoreData() }
        ))
    }
}