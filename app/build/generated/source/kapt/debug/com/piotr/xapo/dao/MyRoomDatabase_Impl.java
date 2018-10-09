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
  private volatile RepositoryDao _repositoryDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `repository` (`url` TEXT NOT NULL, `name` TEXT NOT NULL, `author` TEXT NOT NULL, `description` TEXT NOT NULL, `language` TEXT NOT NULL, `stars` INTEGER NOT NULL, `forks` INTEGER NOT NULL, `currentPeriodStars` INTEGER NOT NULL, PRIMARY KEY(`url`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \"de626ced2bd3e8b064bfb1e650e5532f\")");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `repository`");
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
        final HashMap<String, TableInfo.Column> _columnsRepository = new HashMap<String, TableInfo.Column>(8);
        _columnsRepository.put("url", new TableInfo.Column("url", "TEXT", true, 1));
        _columnsRepository.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsRepository.put("author", new TableInfo.Column("author", "TEXT", true, 0));
        _columnsRepository.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsRepository.put("language", new TableInfo.Column("language", "TEXT", true, 0));
        _columnsRepository.put("stars", new TableInfo.Column("stars", "INTEGER", true, 0));
        _columnsRepository.put("forks", new TableInfo.Column("forks", "INTEGER", true, 0));
        _columnsRepository.put("currentPeriodStars", new TableInfo.Column("currentPeriodStars", "INTEGER", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRepository = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRepository = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRepository = new TableInfo("repository", _columnsRepository, _foreignKeysRepository, _indicesRepository);
        final TableInfo _existingRepository = TableInfo.read(_db, "repository");
        if (! _infoRepository.equals(_existingRepository)) {
          throw new IllegalStateException("Migration didn't properly handle repository(com.piotr.xapo.model.Repository).\n"
                  + " Expected:\n" + _infoRepository + "\n"
                  + " Found:\n" + _existingRepository);
        }
      }
    }, "de626ced2bd3e8b064bfb1e650e5532f", "ae2ee6ac3f1c396485cd58b2b411301f");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    return new InvalidationTracker(this, "repository");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `repository`");
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
  public RepositoryDao repositoryDao() {
    if (_repositoryDao != null) {
      return _repositoryDao;
    } else {
      synchronized(this) {
        if(_repositoryDao == null) {
          _repositoryDao = new RepositoryDao_Impl(this);
        }
        return _repositoryDao;
      }
    }
  }
}
