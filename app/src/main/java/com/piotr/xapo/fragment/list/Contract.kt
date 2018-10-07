package com.piotr.xapo.fragment.list

import com.piotr.xapo.adapter.AdapterUsers
import com.piotr.xapo.base.BaseContract
import com.piotr.xapo.model.User

public open interface Contract {
    interface View {
        fun setAdapterData(users: List<User>)
        fun setAdapterOnClickListener(onClickListener: AdapterUsers.OnItemClickListener)
        fun openDetailsScreen(user: User, image: android.view.View)
        fun showProgress()
        fun hideProgress()
        fun onNoDataFetched()
    }

    interface Presenter : BaseContract.Presenter {
        fun loadData()
        fun restoreData()
    }
}