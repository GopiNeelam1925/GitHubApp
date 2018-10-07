package com.piotr.xapo.dao

import com.piotr.xapo.model.User
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.Database

@Database(entities = [User::class], version = 1)
public abstract class MyRoomDatabase : RoomDatabase() {

    companion object {
        val DATABASE_NAME: String = "test"
    }

    public abstract fun userDao(): UserDao

}
                