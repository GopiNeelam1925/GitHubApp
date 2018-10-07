package com.piotr.xapo.fragment.list

import com.piotr.xapo.di.FragmentScope
import com.piotr.xapo.di.ApplicationComponent
import dagger.Component


@FragmentScope
@Component(modules = [ListModule::class], dependencies = arrayOf(ApplicationComponent::class))
interface ListComponent {
    fun inject(listFragment: ListFragment)
}
