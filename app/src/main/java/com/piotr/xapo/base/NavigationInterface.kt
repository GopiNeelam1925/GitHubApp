package com.piotr.xapo.base

import android.view.View
import com.piotr.xapo.model.User

public interface NavigationInterface {
    fun openDetailsFragment(user: User, image: View)
}