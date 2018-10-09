package com.piotr.xapo

import android.content.Intent
import android.support.test.espresso.Espresso.onData
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
import android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.v7.widget.RecyclerView
import com.piotr.xapo.fragment.details.DetailsFragment
import org.hamcrest.CoreMatchers.anything

/**
 * Created by piotr on 10/9/18.
 */
@RunWith(AndroidJUnit4::class)
public class MainActivityTest {

    @Rule
    @JvmField
    public val mainActivity = ActivityTestRule(
            MainActivity::class.java,
            true,
            // false: do not launch the activity immediately
            false)

    @Before
    fun setup() {
        mainActivity.launchActivity(Intent())
    }


    @Test
    fun testFragment() {
        onView(withId(R.id.recyclerview10)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))

        onData()
        onView(withId(R.id.recyclerview10)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(0, click()))



        onView(withId(R.id.details_root)).check(matches(withEffectiveVisibility(ViewMatchers.Visibility.VISIBLE)))


    }
}