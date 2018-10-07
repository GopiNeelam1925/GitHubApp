package com.piotr.xapo.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\u0012\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0005H\u0002\u00a8\u0006\u0012"}, d2 = {"Lcom/piotr/xapo/activity/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Lcom/piotr/xapo/base/NavigationInterface;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "openDetailsFragment", "user", "Lcom/piotr/xapo/model/User;", "image", "Landroid/view/View;", "setInitialFragment", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity implements com.piotr.xapo.base.NavigationInterface {
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    private final void setInitialFragment() {
    }
    
    @java.lang.Override()
    public void openDetailsFragment(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.model.User user, @org.jetbrains.annotations.NotNull()
    android.view.View image) {
    }
    
    public MainActivity() {
        super();
    }
}