package com.piotr.xapo.dao

import com.piotr.xapo.model.Repository
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

public class DaoRepository(val myRoomDatabase: MyRoomDatabase) {

    /**
     * Because trending repositories changes often we don`t store them permanently.
     */
    fun saveRepositories(repositories: List<Repository>): Observable<List<Repository>> =
            Observable.create(ObservableOnSubscribe<List<Repository>> { emitter ->
                myRoomDatabase.repositoryDao().deleteRepositories()
                myRoomDatabase.repositoryDao().saveRepositories(repositories)
                emitter.onNext(repositories)
            })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())


    fun laodRepositories(): Observable<List<Repository>> =
            Observable.create(ObservableOnSubscribe<List<Repository>> { emitter -> emitter.onNext(myRoomDatabase.repositoryDao().getRepositories()) })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())


}
                