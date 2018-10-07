package com.piotr.xapo.dao;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\n\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\'\u00a8\u0006\f"}, d2 = {"Lcom/piotr/xapo/dao/UserDao;", "", "deleteUser", "", "user", "Lcom/piotr/xapo/model/User;", "getUsers", "", "saveUser", "", "saveUsers", "", "app_debug"})
public abstract interface UserDao {
    
    @android.arch.persistence.room.Insert()
    public abstract long saveUser(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.model.User user);
    
    @android.arch.persistence.room.Delete()
    public abstract int deleteUser(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.model.User user);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM user")
    public abstract java.util.List<com.piotr.xapo.model.User> getUsers();
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.REPLACE)
    public abstract void saveUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.piotr.xapo.model.User> user);
}