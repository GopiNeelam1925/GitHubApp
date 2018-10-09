package com.piotr.xapo.fragment.list

import android.support.v4.widget.SwipeRefreshLayout
import com.piotr.xapo.adapter.AdapterRepositories
import com.piotr.xapo.base.BaseContract
import com.piotr.xapo.model.Repository

public open interface Contract {
    interface View {
        fun setAdapterData(repositories: List<Repository>)
        fun openDetailsScreen(Repository: Repository, image: android.view.View)
        fun showProgress()
        fun hideProgress()
        fun onNoDataFetched()
        fun hideOnErrorLayout()
    }

    interface Presenter : BaseContract.Presenter {
        fun loadData()
        fun restoreData()
        fun onRecyclerViewItemClick(item: Repository, image: android.view.View)
        fun onErrorLayoutClicked()
        fun onSwipeRefresh()


    }
}