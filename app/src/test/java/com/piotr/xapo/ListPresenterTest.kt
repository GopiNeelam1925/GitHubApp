package com.piotr.xapo

import com.piotr.xapo.adapter.AdapterRepositories
import com.piotr.xapo.api.GitHubApi
import com.piotr.xapo.dao.DaoRepository
import com.piotr.xapo.fragment.list.Contract
import com.piotr.xapo.fragment.list.ListPresenter
import com.piotr.xapo.model.Repository
import io.reactivex.Observable
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.ArgumentMatchers
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.Mockito.nullable
import org.mockito.Mockito.times
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

@RunWith(MockitoJUnitRunner::class)
class ListPresenterTest {

    @Mock
    lateinit var view: Contract.View
    @Mock
    lateinit var api: GitHubApi
    @Mock
    lateinit var dao: DaoRepository

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
    }

    @Test
    fun testPresenter() {

        val presenter = ListPresenter(view, api, dao)

        Mockito.`when`(dao.laodRepositories()).thenReturn(Observable.just(ArrayList<Repository>()))
        Mockito.`when`(api.getRepositories()).thenReturn(Observable.just(ArrayList<Repository>()))
        presenter.attach()
        Mockito.verify(view, Mockito.atLeastOnce()).showProgress()
        Mockito.verify(view, Mockito.atLeastOnce()).hideProgress()
        Mockito.verify(view, Mockito.atLeastOnce()).onNoDataFetched()


    }

}