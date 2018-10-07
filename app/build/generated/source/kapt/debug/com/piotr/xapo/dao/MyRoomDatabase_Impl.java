package com.piotr.xapo.dao;

import android.arch.persistence.db.SupportSQLiteDatabase;
import android.arch.persistence.db.SupportSQLiteOpenHelper;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Callback;
import android.arch.persistence.db.SupportSQLiteOpenHelper.Configuration;
import android.arch.persistence.room.DatabaseConfiguration;
import android.arch.persistence.room.InvalidationTracker;
import android.arch.persistence.room.RoomOpenHelper;
import android.arch.persistence.room.RoomOpenHelper.Delegate;
import android.arch.persistence.room.util.TableInfo;
import android.arch.persistence.room.util.TableInfo.Column;
import android.arch.persistence.room.util.TableInfo.ForeignKey;
import android.arch.persistence.room.util.TableInfo.Index;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;

@SuppressWarnings("unchecked")
public class MyRoomDatabase_Impl extends MyRoomDatabase {
  private volatile UserDao _userDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `user` (`login` TEXT NOT NULL, `id` REAL NOT NULL, `node_id` TEXT NOT NULL, `avatar_url` TEXT NOT NULL, `gravatar_id` TEXT NOT NULL, `url` TEXT NOT NULL, `html_url` TEXT NOT NULL, `followers_url` TEXT NOT NULL, `following_url` TEXT NOT NULL, `gists_url` TEXT NOT NULL, `starred_url` TEXT NOT NULL, `subscriptions_url` TEXT NOT NULL, `organizations_url` TEXT NOT NULL, `repos_url` TEXT NOT NULL, `events_url` TEXT NOT NULL, `received_events_url` TEXT NOT NULL, `type` TEXT NOT NULL, `site_admin` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"f81eb04041dd14a3ffad24080805df3e\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `user`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsUser = new HashMap<String, TableInfo.Column>(18);
        _columnsUser.put("login", new TableInfo.Column("login", "TEXT", true, 0));
        _columnsUser.put("id", new TableInfo.Column("id", "REAL", true, 1));
        _columnsUser.put("node_id", new TableInfo.Column("node_id", "TEXT", true, 0));
        _columnsUser.put("avatar_url", new TableInfo.Column("avatar_url", "TEXT", true, 0));
        _columnsUser.put("gravatar_id", new TableInfo.Column("gravatar_id", "TEXT", true, 0));
        _columnsUser.put("url", new TableInfo.Column("url", "TEXT", true, 0));
        _columnsUser.put("html_url", new TableInfo.Column("html_url", "TEXT", true, 0));
        _columnsUser.put("followers_url", new TableInfo.Column("followers_url", "TEXT", true, 0));
        _columnsUser.put("following_url", new TableInfo.Column("following_url", "TEXT", true, 0));
        _columnsUser.put("gists_url", new TableInfo.Column("gists_url", "TEXT", true, 0));
        _columnsUser.put("starred_url", new TableInfo.Column("starred_url", "TEXT", true, 0));
        _columnsUser.put("subscriptions_url", new TableInfo.Column("subscriptions_url", "TEXT", true, 0));
        _columnsUser.put("organizations_url", new TableInfo.Column("organizations_url", "TEXT", true, 0));
        _columnsUser.put("repos_url", new TableInfo.Column("repos_url", "TEXT", true, 0));
        _columnsUser.put("events_url", new TableInfo.Column("events_url", "TEXT", true, 0));
        _columnsUser.put("received_events_url", new TableInfo.Column("received_events_url", "TEXT", true, 0));
        _columnsUser.put("type", new TableInfo.Column("type", "TEXT", true, 0));
        _columnsUser.put("site_admin", new TableInfo.Column("site_admin", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysUser = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesUser = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoUser = new TableInfo("user", _columnsUser, _foreignKeysUser, _indicesUser);
        final TableInfo _existingUser = TableInfo.read(_db, "user");
        if (! _infoUser.equals(_existingUser)) {
          throw new IllegalStateException("Migration didn't properly handle user(com.piotr.xapo.model.User).\n"
                  + " Expected:\n" + _infoUser + "\n"
                  + " Found:\n" + _existingUser);
        }
      }
    }, "f81eb04041dd14a3ffad24080805df3e", "6aa42a5b395d8c32f1ee4036165750b9");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "user");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `user`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public UserDao userDao() {
    if (_userDao != null) {
      return _userDao;
    } else {
      synchronized(this) {
        if(_userDao == null) {
          _userDao = new UserDao_Impl(this);
        }
        return _userDao;
      }
    }
  }
}
