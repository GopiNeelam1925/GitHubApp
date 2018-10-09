package com.piotr.xapo.fragment.list

import android.support.v4.widget.SwipeRefreshLayout
import android.util.Log
import android.view.View
import com.piotr.xapo.adapter.AdapterRepositories
import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.base.BasePresenter
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.model.Repository
import javax.inject.Inject

public class ListPresenter @Inject constructor(
        var view: Contract.View,
        var gitHubApi: GitHubApi,
        var repository: DaoRepository) : BasePresenter(), Contract.Presenter {


    override fun attach() {
        super.attach()
        view.showProgress()
        loadData()
    }

    private fun setData(repositories: List<Repository>) {
        view.hideProgress()
        view.setAdapterData(repositories)
        if (repositories.size == 0) {
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
        System.out.println("api " + gitHubApi)
        System.out.println("repositories  " + gitHubApi.getRepositories())

        subscribe(gitHubApi.getRepositories().subscribe(
                { result -> storeData(result) },
                { error -> restoreData() }
        ))
    }

    override fun onRecyclerViewItemClick(item: Repository, image: View) {
        view.openDetailsScreen(item, image)
    }

    override fun onErrorLayoutClicked() {
        view.hideOnErrorLayout()
        view.showProgress()
        loadData()
    }

    override fun onSwipeRefresh() {
        loadData()
    }

}