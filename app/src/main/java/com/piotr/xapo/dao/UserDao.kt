package com.piotr.xapo.dao

import android.arch.persistence.room.OnConflictStrategy
import android.arch.persistence.room.Delete
import com.piotr.xapo.model.User
import android.arch.persistence.room.Insert
import android.arch.persistence.room.Query
import android.arch.persistence.room.Dao

@Dao
public interface UserDao {


    @Insert
    public fun saveUser(user: User): Long

    @Delete
    public fun deleteUser(user: User): Int

    @Query("SELECT * FROM user")
    public fun getUsers(): List<User>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun saveUsers(user: List<User>)

}
                