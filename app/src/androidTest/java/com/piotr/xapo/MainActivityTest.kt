package com.piotr.xapo

import android.content.Intent
import android.support.test.runner.AndroidJUnit4
import org.junit.runner.RunWith
import com.piotr.xapo.activity.MainActivity
import android.support.test.rule.ActivityTestRule
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.contrib.RecyclerViewActions
import android.support.test.espresso.matcher.ViewMatchers
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.v7.widget.RecyclerView
import com.piotr.xapo.adapter.AdapterRepositories
import com.piotr.xapo.model.Repository

/**
 * Created by piotr on 10/9/18.
 */
@RunWith(AndroidJUnit4::class)
public class MainActivityTest {

    val testData: List<Repository> = TestValues.getTestRepositories()
    @Rule
    @JvmField
    public val mainActivity = ActivityTestRule(
            MainActivity::class.java,
            true,
            false)

    @Before
    fun setup() {
        mainActivity.launchActivity(Intent())
    }


    @Test
    fun testFragment() {
        //Check if recyclerView is visible
        onView(withId(R.id.recyclerview10)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))

        //iterate over test data
        for (i in testData.indices) {
            val repository = testData[i]

            //scroll recyclerview to position
            onView(withId(R.id.recyclerview10)).perform(RecyclerViewActions.scrollToPosition<AdapterRepositories.AdapterViewHolder>(i))
            //check if repository name and author are displayed
            onView(withText(repository.name)).check(matches(isDisplayed()))
            onView(withText(repository.author)).check(matches(isDisplayed()))

            //perform click on RecyclerViewItem
            onView(withId(R.id.recyclerview10)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(i, click()))

            //check if details screen is visible
            onView(withId(R.id.details_root)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))

            //check if repository fields are displayed to the user
            onView(withText(repository.author)).check(matches(isDisplayed()))
            onView(withText(Integer.toString(repository.currentPeriodStars))).check(matches(isDisplayed()))
            onView(withText(repository.description)).check(matches(isDisplayed()))
            onView(withText(Integer.toString(repository.forks))).check(matches(isDisplayed()))
            onView(withText(repository.language)).check(matches(isDisplayed()))

            //wait for transition to finish
            Thread.sleep(1000)
            //go back to list fragment
            mainActivity.activity.runOnUiThread { mainActivity.activity.onBackPressed() }

        }


    }
}