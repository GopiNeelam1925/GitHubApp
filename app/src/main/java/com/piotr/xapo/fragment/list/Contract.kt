package com.piotr.xapo.fragment.list

import com.piotr.xapo.adapter.AdapterRepositorys
import com.piotr.xapo.base.BaseContract
import com.piotr.xapo.model.Repository

public open interface Contract {
    interface View {
        fun setAdapterData(Repositorys: List<Repository>)
        fun setAdapterOnClickListener(onClickListener: AdapterRepositorys.OnItemClickListener)
        fun openDetailsScreen(Repository: Repository, image: android.view.View)
        fun showProgress()
        fun hideProgress()
        fun onNoDataFetched()
    }

    interface Presenter : BaseContract.Presenter {
        fun loadData()
        fun restoreData()
    }
}