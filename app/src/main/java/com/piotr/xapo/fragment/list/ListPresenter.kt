package com.piotr.xapo.fragment.list

import android.support.v4.widget.SwipeRefreshLayout
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
        view.setAdapterOnClickListener(object : AdapterRepositories.OnItemClickListener {
            override fun onItemClick(position: Int, item: Repository, image: View) {
                view.openDetailsScreen(item, image)
            }
        })

        view.setOnErrorLayoutClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view.hideOnErrorLayout()
                view.showProgress()
                loadData()
            }
        })

        view.setSwipeToRefreshListener(object : SwipeRefreshLayout.OnRefreshListener {
            override fun onRefresh() {
                loadData()
            }
        })
        view.showProgress()
        loadData()
    }

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
        subscribe(gitHubApi.getRepositories().subscribe(
                { result -> storeData(result) },
                { error -> restoreData() }
        ))
    }
}