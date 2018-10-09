package com.piotr.xapo.fragment.details

import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.base.BasePresenter
import com.piotr.xapo.dao.DaoRepository
import javax.inject.Inject

public class DetailsPresenter @Inject constructor(
        var view: Contract.View,
        var gitHubApi: GitHubApi,
        var repository: DaoRepository) : BasePresenter(), Contract.Presenter {
}