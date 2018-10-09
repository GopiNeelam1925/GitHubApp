package com.piotr.xapo.fragment.list

import android.support.v4.widget.SwipeRefreshLayout
import com.piotr.xapo.adapter.AdapterRepositories
import com.piotr.xapo.base.BaseContract
import com.piotr.xapo.model.Repository

public open interface Contract {
    interface View {
        fun setAdapterData(Repositorys: List<Repository>)
        fun setAdapterOnClickListener(onClickListener: AdapterRepositories.OnItemClickListener)
        fun setOnErrorLayoutClickListener(onClickListener: android.view.View.OnClickListener)
        fun setSwipeToRefreshListener(swipeToRefreshListener: SwipeRefreshLayout.OnRefreshListener)
        fun openDetailsScreen(Repository: Repository, image: android.view.View)
        fun showProgress()
        fun hideProgress()
        fun onNoDataFetched()
        fun hideOnErrorLayout()
    }

    interface Presenter : BaseContract.Presenter {
        fun loadData()
        fun restoreData()

    }
}