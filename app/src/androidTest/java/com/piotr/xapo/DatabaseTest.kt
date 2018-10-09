package com.piotr.xapo

import org.junit.After
import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.piotr.xapo.dao.MyRoomDatabase
import com.piotr.xapo.dao.RepositoryDao
import com.piotr.xapo.model.Repository
import org.junit.Before
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
public class DatabaseTest {


    var repositoryDao: RepositoryDao? = null
    var mDb: MyRoomDatabase? = null

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getTargetContext()
        mDb = Room.inMemoryDatabaseBuilder(context, MyRoomDatabase::class.java).build()
        repositoryDao = mDb!!.repositoryDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        mDb!!.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeUserAndReadInList() {
        val user = Repository(0,

                "node_id",
                "avatar_url",
                "gravatar_url",
                "url",
                "test",
                2,
                3,
                2)
        val users = ArrayList<Repository>()
        users.add(user)
        repositoryDao!!.saveRepositories(users)

        val repositoriesLoaded = repositoryDao!!.getRepositories()
        assert(repositoriesLoaded.isNotEmpty())
        assertEquals(users.size, repositoriesLoaded.size)
    }

}