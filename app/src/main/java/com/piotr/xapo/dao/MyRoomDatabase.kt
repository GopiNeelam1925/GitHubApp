package com.piotr.xapo.dao

import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database
import com.piotr.xapo.model.Repository

@Database(entities = [Repository::class], version = 1)
public abstract class MyRoomDatabase : RoomDatabase() {

    companion object {
        val DATABASE_NAME: String = "test"
    }

    public abstract fun repositoryDao(): RepositoryDao

}
                