package com.piotr.xapo.list

import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.piotr.xapo.TestGitHubApi
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.dao.MyRoomDatabase
import com.piotr.xapo.fragment.list.Contract
import com.piotr.xapo.fragment.list.ListPresenter
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.Mockito


/**
 * This could be a unit test if we didnt test database on real device.
 */

@RunWith(AndroidJUnit4::class)
public class PresenterTest {


    var presenter: ListPresenter? = null
    var view: Contract.View = Mockito.mock(TestView::class.java)


    @Before
    fun init() {
        val context = InstrumentationRegistry.getTargetContext()
        val db = Room.inMemoryDatabaseBuilder(context, MyRoomDatabase::class.java).build()
        val gitHubApi = TestGitHubApi.getInstance()
        val daoRepository = DaoRepository(db);
        presenter = ListPresenter(view, gitHubApi, daoRepository)

    }

    @Test
    fun testDataLoadingSuccess() {
        presenter!!.loadData()
        Mockito.verify(view.onNoDataFetched(), Mockito.times(1))
    }

}