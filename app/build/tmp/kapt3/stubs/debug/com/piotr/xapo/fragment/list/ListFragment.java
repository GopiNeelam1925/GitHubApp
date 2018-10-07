package com.piotr.xapo.fragment.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0012\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\b\u0010\u001c\u001a\u00020\u0011H\u0016J\u0018\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0016H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001f0#H\u0016J\u0010\u0010$\u001a\u00020\u00112\u0006\u0010%\u001a\u00020&H\u0016J\b\u0010\'\u001a\u00020\u0011H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006("}, d2 = {"Lcom/piotr/xapo/fragment/list/ListFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/piotr/xapo/fragment/list/Contract$View;", "()V", "adapterUsers", "Lcom/piotr/xapo/adapter/AdapterUsers;", "binding", "Lcom/piotr/xapo/databinding/FragmentListBinding;", "initialized", "", "presenter", "Lcom/piotr/xapo/fragment/list/Contract$Presenter;", "getPresenter", "()Lcom/piotr/xapo/fragment/list/Contract$Presenter;", "setPresenter", "(Lcom/piotr/xapo/fragment/list/Contract$Presenter;)V", "hideProgress", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "parent", "Landroid/view/ViewGroup;", "onDestroyView", "onNoDataFetched", "openDetailsScreen", "user", "Lcom/piotr/xapo/model/User;", "image", "setAdapterData", "users", "", "setAdapterOnClickListener", "onClickListener", "Lcom/piotr/xapo/adapter/AdapterUsers$OnItemClickListener;", "showProgress", "app_debug"})
public final class ListFragment extends android.support.v4.app.Fragment implements com.piotr.xapo.fragment.list.Contract.View {
    private com.piotr.xapo.databinding.FragmentListBinding binding;
    private final com.piotr.xapo.adapter.AdapterUsers adapterUsers = null;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.piotr.xapo.fragment.list.Contract.Presenter presenter;
    private boolean initialized;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.piotr.xapo.fragment.list.Contract.Presenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.fragment.list.Contract.Presenter p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup parent, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void setAdapterData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.piotr.xapo.model.User> users) {
    }
    
    @java.lang.Override()
    public void setAdapterOnClickListener(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.adapter.AdapterUsers.OnItemClickListener onClickListener) {
    }
    
    @java.lang.Override()
    public void openDetailsScreen(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.model.User user, @org.jetbrains.annotations.NotNull()
    android.view.View image) {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    @java.lang.Override()
    public void onNoDataFetched() {
    }
    
    public ListFragment() {
        super();
    }
}