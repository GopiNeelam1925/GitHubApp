package com.piotr.xapo.activity;

import android.support.v7.app.AppCompatActivity
import android.view.View
import com.piotr.xapo.R
import com.piotr.xapo.base.NavigationInterface
import com.piotr.xapo.fragment.details.DetailsFragment
import com.piotr.xapo.fragment.list.ListFragment
import android.os.Build
import android.os.Bundle
import android.transition.*
import android.transition.TransitionSet.ORDERING_TOGETHER
import android.view.Gravity
import android.view.MenuItem
import com.piotr.xapo.model.Repository


class MainActivity : AppCompatActivity(), NavigationInterface {


    override fun onCreate(savedInstanceState: android.os.Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        if (savedInstanceState == null) {
            setInitialFragment()
        }

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager.addOnBackStackChangedListener {
            if (supportFragmentManager.backStackEntryCount == 0)
                supportActionBar?.setDisplayHomeAsUpEnabled(false)
            else
                supportActionBar?.setDisplayHomeAsUpEnabled(true)
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home) {
            onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }


    private fun setInitialFragment() {
        val listFragment = ListFragment()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            listFragment.allowEnterTransitionOverlap = true
            listFragment.exitTransition = Fade()
        }
        supportFragmentManager.beginTransaction().add(R.id.container, listFragment).commit()
    }

    override fun openDetailsFragment(repository: Repository, image: View) {
        val details = DetailsFragment()
        var bundle = Bundle()
        bundle.putSerializable("repository", repository)
        details.arguments = bundle
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            val detailsTransition = TransitionSet()
            detailsTransition.ordering = ORDERING_TOGETHER
            detailsTransition.addTransition(ChangeBounds()).addTransition(ChangeTransform())
            details.allowEnterTransitionOverlap = true
            details.sharedElementEnterTransition = detailsTransition
            details.sharedElementReturnTransition = detailsTransition
            details.enterTransition = Slide(Gravity.END)
        }
        supportFragmentManager.beginTransaction()
                .addSharedElement(image, "profile")
                .replace(R.id.container, details)
                .addToBackStack(null).commit()
        /*
        JetPack Navigation doesnt support fragment shared element transitions yet.

        val extras = FragmentNavigatorExtras(image to "image")
        Navigation.findNavController(image).navigate(R.id.action_ListFragment_to_DetailsFragment,
               null, // Bundle of args
               null, // NavOptions
               extras)
           */

    }

}
                