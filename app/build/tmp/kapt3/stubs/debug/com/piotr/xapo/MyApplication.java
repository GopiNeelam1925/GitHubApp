package com.piotr.xapo;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/piotr/xapo/MyApplication;", "Landroid/app/Application;", "()V", "appComponent", "Lcom/piotr/xapo/di/ApplicationComponent;", "getAppComponent", "onCreate", "", "Companion", "app_debug"})
public class MyApplication extends android.app.Application {
    private com.piotr.xapo.di.ApplicationComponent appComponent;
    @org.jetbrains.annotations.NotNull()
    private static com.piotr.xapo.MyApplication instance;
    public static final com.piotr.xapo.MyApplication.Companion Companion = null;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public com.piotr.xapo.di.ApplicationComponent getAppComponent() {
        return null;
    }
    
    public MyApplication() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lcom/piotr/xapo/MyApplication$Companion;", "", "()V", "<set-?>", "Lcom/piotr/xapo/MyApplication;", "instance", "getInstance", "()Lcom/piotr/xapo/MyApplication;", "setInstance", "(Lcom/piotr/xapo/MyApplication;)V", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.piotr.xapo.MyApplication getInstance() {
            return null;
        }
        
        private final void setInstance(com.piotr.xapo.MyApplication p0) {
        }
        
        private Companion() {
            super();
        }
    }
}