package com.piotr.xapo.dao

import com.piotr.xapo.model.Repository
import io.reactivex.Observable
import io.reactivex.ObservableOnSubscribe
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

public class DaoRepository(val myRoomDatabase: MyRoomDatabase) {

    /*
    fun saveUsers(users: List<User>): Observable<List<User>> =
            Observable.create(ObservableOnSubscribe<List<User>> { emitter ->
                myRoomDatabase.userDao().saveUsers(users)
                emitter.onNext(users)
            })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())


    fun loadUsers(): Observable<List<User>> =
            Observable.create(ObservableOnSubscribe<List<User>> { emitter -> emitter.onNext(myRoomDatabase.userDao().getUsers()) })
                    .subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread())
   */
    fun saveRepositories(repositories: List<Repository>): Observable<List<Repository>> =
            Observable.create(ObservableOnSubscribe<List<Repository>> { emitter ->
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
                