package com.piotr.xapo.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\nH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0016J\u0014\u0010\u0015\u001a\u00020\u000f2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0017J\u000e\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/piotr/xapo/adapter/AdapterUsers;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/piotr/xapo/adapter/AdapterUsers$AdapterViewHolder;", "()V", "data", "", "Lcom/piotr/xapo/model/User;", "onItemClickListener", "Lcom/piotr/xapo/adapter/AdapterUsers$OnItemClickListener;", "getItemCount", "", "getItemId", "", "position", "onBindViewHolder", "", "viewHolder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setData", "newData", "", "setOnItemClickListener", "AdapterViewHolder", "OnItemClickListener", "app_debug"})
public final class AdapterUsers extends android.support.v7.widget.RecyclerView.Adapter<com.piotr.xapo.adapter.AdapterUsers.AdapterViewHolder> {
    private com.piotr.xapo.adapter.AdapterUsers.OnItemClickListener onItemClickListener;
    private java.util.List<com.piotr.xapo.model.User> data;
    
    @java.lang.Override()
    public long getItemId(int position) {
        return 0L;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.List<com.piotr.xapo.model.User> newData) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.piotr.xapo.adapter.AdapterUsers.AdapterViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.adapter.AdapterUsers.AdapterViewHolder viewHolder, int position) {
    }
    
    public final void setOnItemClickListener(@org.jetbrains.annotations.NotNull()
    com.piotr.xapo.adapter.AdapterUsers.OnItemClickListener onItemClickListener) {
    }
    
    public AdapterUsers() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lcom/piotr/xapo/adapter/AdapterUsers$OnItemClickListener;", "", "onItemClick", "", "position", "", "item", "Lcom/piotr/xapo/model/User;", "image", "Landroid/view/View;", "app_debug"})
    public static abstract interface OnItemClickListener {
        
        public abstract void onItemClick(int position, @org.jetbrains.annotations.NotNull()
        com.piotr.xapo.model.User item, @org.jetbrains.annotations.NotNull()
        android.view.View image);
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/piotr/xapo/adapter/AdapterUsers$AdapterViewHolder;", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "view", "Lcom/piotr/xapo/databinding/RowUserBinding;", "(Lcom/piotr/xapo/databinding/RowUserBinding;)V", "image", "Landroid/widget/ImageView;", "getImage", "()Landroid/widget/ImageView;", "getView", "()Lcom/piotr/xapo/databinding/RowUserBinding;", "app_debug"})
    public static final class AdapterViewHolder extends android.support.v7.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final android.widget.ImageView image = null;
        @org.jetbrains.annotations.NotNull()
        private final com.piotr.xapo.databinding.RowUserBinding view = null;
        
        @org.jetbrains.annotations.NotNull()
        public final android.widget.ImageView getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.piotr.xapo.databinding.RowUserBinding getView() {
            return null;
        }
        
        public AdapterViewHolder(@org.jetbrains.annotations.NotNull()
        com.piotr.xapo.databinding.RowUserBinding view) {
            super(null);
        }
    }
}