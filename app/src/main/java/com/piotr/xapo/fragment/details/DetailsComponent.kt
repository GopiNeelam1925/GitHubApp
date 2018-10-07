package com.piotr.xapo.fragment.details

import com.piotr.xapo.di.FragmentScope
import com.piotr.xapo.di.ApplicationComponent
import dagger.Component


@FragmentScope
@Component(modules = [DetailsModule::class], dependencies = arrayOf(ApplicationComponent::class))
interface DetailsComponent {
    fun inject(detailsFragment: DetailsFragment)
}
