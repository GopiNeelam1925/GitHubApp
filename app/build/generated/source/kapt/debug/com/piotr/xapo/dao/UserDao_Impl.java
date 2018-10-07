package com.piotr.xapo.dao;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.database.Cursor;
import com.piotr.xapo.model.User;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class UserDao_Impl implements UserDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfUser;

  private final EntityInsertionAdapter __insertionAdapterOfUser_1;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfUser;

  public UserDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfUser = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `user`(`login`,`id`,`node_id`,`avatar_url`,`gravatar_id`,`url`,`html_url`,`followers_url`,`following_url`,`gists_url`,`starred_url`,`subscriptions_url`,`organizations_url`,`repos_url`,`events_url`,`received_events_url`,`type`,`site_admin`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getLogin() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLogin());
        }
        stmt.bindDouble(2, value.getId());
        if (value.getNode_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNode_id());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAvatar_url());
        }
        if (value.getGravatar_id() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGravatar_id());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHtml_url());
        }
        if (value.getFollowers_url() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFollowers_url());
        }
        if (value.getFollowing_url() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFollowing_url());
        }
        if (value.getGists_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGists_url());
        }
        if (value.getStarred_url() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStarred_url());
        }
        if (value.getSubscriptions_url() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSubscriptions_url());
        }
        if (value.getOrganizations_url() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOrganizations_url());
        }
        if (value.getRepos_url() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getRepos_url());
        }
        if (value.getEvents_url() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEvents_url());
        }
        if (value.getReceived_events_url() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getReceived_events_url());
        }
        if (value.getType() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getType());
        }
        final int _tmp;
        _tmp = value.getSite_admin() ? 1 : 0;
        stmt.bindLong(18, _tmp);
      }
    };
    this.__insertionAdapterOfUser_1 = new EntityInsertionAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `user`(`login`,`id`,`node_id`,`avatar_url`,`gravatar_id`,`url`,`html_url`,`followers_url`,`following_url`,`gists_url`,`starred_url`,`subscriptions_url`,`organizations_url`,`repos_url`,`events_url`,`received_events_url`,`type`,`site_admin`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        if (value.getLogin() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLogin());
        }
        stmt.bindDouble(2, value.getId());
        if (value.getNode_id() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getNode_id());
        }
        if (value.getAvatar_url() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAvatar_url());
        }
        if (value.getGravatar_id() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getGravatar_id());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUrl());
        }
        if (value.getHtml_url() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getHtml_url());
        }
        if (value.getFollowers_url() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getFollowers_url());
        }
        if (value.getFollowing_url() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getFollowing_url());
        }
        if (value.getGists_url() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getGists_url());
        }
        if (value.getStarred_url() == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, value.getStarred_url());
        }
        if (value.getSubscriptions_url() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getSubscriptions_url());
        }
        if (value.getOrganizations_url() == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, value.getOrganizations_url());
        }
        if (value.getRepos_url() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getRepos_url());
        }
        if (value.getEvents_url() == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, value.getEvents_url());
        }
        if (value.getReceived_events_url() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getReceived_events_url());
        }
        if (value.getType() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getType());
        }
        final int _tmp;
        _tmp = value.getSite_admin() ? 1 : 0;
        stmt.bindLong(18, _tmp);
      }
    };
    this.__deletionAdapterOfUser = new EntityDeletionOrUpdateAdapter<User>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `user` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, User value) {
        stmt.bindDouble(1, value.getId());
      }
    };
  }

  @Override
  public long saveUser(User user) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfUser.insertAndReturnId(user);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void saveUsers(List<User> user) {
    __db.beginTransaction();
    try {
      __insertionAdapterOfUser_1.insert(user);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public int deleteUser(User user) {
    int _total = 0;
    __db.beginTransaction();
    try {
      _total +=__deletionAdapterOfUser.handle(user);
      __db.setTransactionSuccessful();
      return _total;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<User> getUsers() {
    final String _sql = "SELECT * FROM user";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfLogin = _cursor.getColumnIndexOrThrow("login");
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfNodeId = _cursor.getColumnIndexOrThrow("node_id");
      final int _cursorIndexOfAvatarUrl = _cursor.getColumnIndexOrThrow("avatar_url");
      final int _cursorIndexOfGravatarId = _cursor.getColumnIndexOrThrow("gravatar_id");
      final int _cursorIndexOfUrl = _cursor.getColumnIndexOrThrow("url");
      final int _cursorIndexOfHtmlUrl = _cursor.getColumnIndexOrThrow("html_url");
      final int _cursorIndexOfFollowersUrl = _cursor.getColumnIndexOrThrow("followers_url");
      final int _cursorIndexOfFollowingUrl = _cursor.getColumnIndexOrThrow("following_url");
      final int _cursorIndexOfGistsUrl = _cursor.getColumnIndexOrThrow("gists_url");
      final int _cursorIndexOfStarredUrl = _cursor.getColumnIndexOrThrow("starred_url");
      final int _cursorIndexOfSubscriptionsUrl = _cursor.getColumnIndexOrThrow("subscriptions_url");
      final int _cursorIndexOfOrganizationsUrl = _cursor.getColumnIndexOrThrow("organizations_url");
      final int _cursorIndexOfReposUrl = _cursor.getColumnIndexOrThrow("repos_url");
      final int _cursorIndexOfEventsUrl = _cursor.getColumnIndexOrThrow("events_url");
      final int _cursorIndexOfReceivedEventsUrl = _cursor.getColumnIndexOrThrow("received_events_url");
      final int _cursorIndexOfType = _cursor.getColumnIndexOrThrow("type");
      final int _cursorIndexOfSiteAdmin = _cursor.getColumnIndexOrThrow("site_admin");
      final List<User> _result = new ArrayList<User>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final User _item;
        final String _tmpLogin;
        _tmpLogin = _cursor.getString(_cursorIndexOfLogin);
        final float _tmpId;
        _tmpId = _cursor.getFloat(_cursorIndexOfId);
        final String _tmpNode_id;
        _tmpNode_id = _cursor.getString(_cursorIndexOfNodeId);
        final String _tmpAvatar_url;
        _tmpAvatar_url = _cursor.getString(_cursorIndexOfAvatarUrl);
        final String _tmpGravatar_id;
        _tmpGravatar_id = _cursor.getString(_cursorIndexOfGravatarId);
        final String _tmpUrl;
        _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        final String _tmpHtml_url;
        _tmpHtml_url = _cursor.getString(_cursorIndexOfHtmlUrl);
        final String _tmpFollowers_url;
        _tmpFollowers_url = _cursor.getString(_cursorIndexOfFollowersUrl);
        final String _tmpFollowing_url;
        _tmpFollowing_url = _cursor.getString(_cursorIndexOfFollowingUrl);
        final String _tmpGists_url;
        _tmpGists_url = _cursor.getString(_cursorIndexOfGistsUrl);
        final String _tmpStarred_url;
        _tmpStarred_url = _cursor.getString(_cursorIndexOfStarredUrl);
        final String _tmpSubscriptions_url;
        _tmpSubscriptions_url = _cursor.getString(_cursorIndexOfSubscriptionsUrl);
        final String _tmpOrganizations_url;
        _tmpOrganizations_url = _cursor.getString(_cursorIndexOfOrganizationsUrl);
        final String _tmpRepos_url;
        _tmpRepos_url = _cursor.getString(_cursorIndexOfReposUrl);
        final String _tmpEvents_url;
        _tmpEvents_url = _cursor.getString(_cursorIndexOfEventsUrl);
        final String _tmpReceived_events_url;
        _tmpReceived_events_url = _cursor.getString(_cursorIndexOfReceivedEventsUrl);
        final String _tmpType;
        _tmpType = _cursor.getString(_cursorIndexOfType);
        final boolean _tmpSite_admin;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfSiteAdmin);
        _tmpSite_admin = _tmp != 0;
        _item = new User(_tmpLogin,_tmpId,_tmpNode_id,_tmpAvatar_url,_tmpGravatar_id,_tmpUrl,_tmpHtml_url,_tmpFollowers_url,_tmpFollowing_url,_tmpGists_url,_tmpStarred_url,_tmpSubscriptions_url,_tmpOrganizations_url,_tmpRepos_url,_tmpEvents_url,_tmpReceived_events_url,_tmpType,_tmpSite_admin);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
