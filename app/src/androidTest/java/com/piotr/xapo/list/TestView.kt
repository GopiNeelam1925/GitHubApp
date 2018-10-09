package com.piotr.xapo.list

import android.view.View
import com.piotr.xapo.adapter.AdapterUsers
import com.piotr.xapo.fragment.list.Contract

public class TestView : Contract.View{
    override fun setAdapterData(users: List<User>) {
    }

    override fun setAdapterOnClickListener(onClickListener: AdapterUsers.OnItemClickListener) {
    }

    override fun openDetailsScreen(user: User, image: View) {
    }

    override fun showProgress() {
    }

    override fun hideProgress() {
    }

    override fun onNoDataFetched() {
    }
}