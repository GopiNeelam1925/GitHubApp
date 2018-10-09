package com.piotr.xapo.dao

import android.arch.persistence.room.*
import com.piotr.xapo.model.Repository

@Dao
public interface RepositoryDao {


    @Insert
    public fun saveRepository(user: Repository): Long

    @Delete
    public fun deleteRepository(user: Repository): Int

    @Query("SELECT * FROM repository")
    public fun getRepositories(): List<Repository>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    public fun saveRepositories(user: List<Repository>)

    @Query("DELETE FROM repository")
    public fun deleteRepositories()




}
