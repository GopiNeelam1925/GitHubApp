package com.piotr.xapo.fragment.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract;", "", "Presenter", "View", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0012H&J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0015H&J\b\u0010\u0016\u001a\u00020\u0003H&\u00a8\u0006\u0017"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract$View;", "", "hideOnErrorLayout", "", "hideProgress", "onNoDataFetched", "openDetailsScreen", "Repository", "Lcom/piotr/xapo/model/Repository;", "image", "Landroid/view/View;", "setAdapterData", "Repositorys", "", "setAdapterOnClickListener", "onClickListener", "Lcom/piotr/xapo/adapter/AdapterRepositories$OnItemClickListener;", "setOnErrorLayoutClickListener", "Landroid/view/View$OnClickListener;", "setSwipeToRefreshListener", "swipeToRefreshListener", "Landroid/support/v4/widget/SwipeRefreshLayout$OnRefreshListener;", "showProgress", "app_debug"})
    public static abstract interface View {
        
        public abstract void setAdapterData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.piotr.xapo.model.Repository> Repositorys);
        
        public abstract void setAdapterOnClickListener(@org.jetbrains.annotations.NotNull()
        com.piotr.xapo.adapter.AdapterRepositories.OnItemClickListener onClickListener);
        
        public abstract void setOnErrorLayoutClickListener(@org.jetbrains.annotations.NotNull()
        android.view.View.OnClickListener onClickListener);
        
        public abstract void setSwipeToRefreshListener(@org.jetbrains.annotations.NotNull()
        android.support.v4.widget.SwipeRefreshLayout.OnRefreshListener swipeToRefreshListener);
        
        public abstract void openDetailsScreen(@org.jetbrains.annotations.NotNull()
        com.piotr.xapo.model.Repository Repository, @org.jetbrains.annotations.NotNull()
        android.view.View image);
        
        public abstract void showProgress();
        
        public abstract void hideProgress();
        
        public abstract void onNoDataFetched();
        
        public abstract void hideOnErrorLayout();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract$Presenter;", "Lcom/piotr/xapo/base/BaseContract$Presenter;", "loadData", "", "restoreData", "app_debug"})
    public static abstract interface Presenter extends com.piotr.xapo.base.BaseContract.Presenter {
        
        public abstract void loadData();
        
        public abstract void restoreData();
    }
}