package com.piotr.xapo.fragment.list

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.base.BasePresenter
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.model.User
import javax.inject.Inject

public class ListPresenter @Inject constructor(
        var view: Contract.View,
        var gitHubApi: GitHubApi,
        var repository: DaoRepository) : BasePresenter(), Contract.Presenter {

    private fun setData(users: List<User>) {
        view.hideProgress()
        view.setAdapterData(users)
        if (users.size == 0) {
            view.onNoDataFetched()
        }
    }

    private fun storeData(users: List<User>) {
        subscribe(repository.saveUsers(users).subscribe { _ ->
            setData(users)
        })
    }

    override fun restoreData() {
        subscribe(repository.loadUsers().subscribe { users ->
            setData(users)
        })
    }

    override fun loadData() {
        view.showProgress()
        subscribe(gitHubApi.getUsers().subscribe(
                { result -> storeData(result) },
                { error -> restoreData() }
        ))
    }
}