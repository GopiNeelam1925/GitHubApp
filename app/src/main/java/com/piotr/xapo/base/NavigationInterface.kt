package com.piotr.xapo.base

import android.view.View
import com.piotr.xapo.model.Repository

public interface NavigationInterface {
    fun openDetailsFragment(repository: Repository, image: View)
}