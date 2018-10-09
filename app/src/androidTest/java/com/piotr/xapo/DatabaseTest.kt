package com.piotr.xapo

import org.junit.After
import android.arch.persistence.room.Room
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.piotr.xapo.dao.MyRoomDatabase
import org.junit.Before
import org.junit.Assert.*
import org.junit.Test
import org.junit.runner.RunWith
import java.io.IOException

@RunWith(AndroidJUnit4::class)
public class DatabaseTest {


    var mUserDao: UserDao? = null
    var mDb: MyRoomDatabase? = null

    @Before
    fun createDb() {
        val context = InstrumentationRegistry.getTargetContext()
        mDb = Room.inMemoryDatabaseBuilder(context, MyRoomDatabase::class.java).build()
        mUserDao = mDb!!.userDao()
    }

    @After
    @Throws(IOException::class)
    fun closeDb() {
        mDb!!.close()
    }

    @Test
    @Throws(Exception::class)
    fun writeUserAndReadInList() {
        val user = User("login",
                0.1f,
                "node_id",
                "avatar_url",
                "gravatar_url",
                "url",
                "html",
                "followers",
                "following",
                "gists",
                "starred",
                "subscriptons",
                "organisations",
                "repos",
                "events",
                "received",
                "type",
                true)
        val users = ArrayList<User>()
        users.add(user)
        mUserDao!!.saveUsers(users)

        val loadedUsers = mUserDao!!.getUsers()
        assert(loadedUsers.isNotEmpty())
        assertEquals(users.size, loadedUsers.size)
    }

}