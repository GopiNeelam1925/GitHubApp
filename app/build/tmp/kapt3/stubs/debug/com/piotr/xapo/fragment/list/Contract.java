package com.piotr.xapo.fragment.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract;", "", "Presenter", "View", "app_debug"})
public abstract interface Contract {
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0016\u0010\u000b\u001a\u00020\u00032\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\rH&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract$View;", "", "hideOnErrorLayout", "", "hideProgress", "onNoDataFetched", "openDetailsScreen", "Repository", "Lcom/piotr/xapo/model/Repository;", "image", "Landroid/view/View;", "setAdapterData", "repositories", "", "showProgress", "app_debug"})
    public static abstract interface View {
        
        public abstract void setAdapterData(@org.jetbrains.annotations.NotNull()
        java.util.List<com.piotr.xapo.model.Repository> repositories);
        
        public abstract void openDetailsScreen(@org.jetbrains.annotations.NotNull()
        com.piotr.xapo.model.Repository Repository, @org.jetbrains.annotations.NotNull()
        android.view.View image);
        
        public abstract void showProgress();
        
        public abstract void hideProgress();
        
        public abstract void onNoDataFetched();
        
        public abstract void hideOnErrorLayout();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u0003H&J\b\u0010\u000b\u001a\u00020\u0003H&\u00a8\u0006\f"}, d2 = {"Lcom/piotr/xapo/fragment/list/Contract$Presenter;", "Lcom/piotr/xapo/base/BaseContract$Presenter;", "loadData", "", "onErrorLayoutClicked", "onRecyclerViewItemClick", "item", "Lcom/piotr/xapo/model/Repository;", "image", "Landroid/view/View;", "onSwipeRefresh", "restoreData", "app_debug"})
    public static abstract interface Presenter extends com.piotr.xapo.base.BaseContract.Presenter {
        
        public abstract void loadData();
        
        public abstract void restoreData();
        
        public abstract void onRecyclerViewItemClick(@org.jetbrains.annotations.NotNull()
        com.piotr.xapo.model.Repository item, @org.jetbrains.annotations.NotNull()
        android.view.View image);
        
        public abstract void onErrorLayoutClicked();
        
        public abstract void onSwipeRefresh();
    }
}