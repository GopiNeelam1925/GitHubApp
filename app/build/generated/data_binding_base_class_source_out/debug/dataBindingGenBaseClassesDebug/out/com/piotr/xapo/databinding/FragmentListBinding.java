package com.piotr.xapo.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public abstract class FragmentListBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final ProgressBar bar;

  @NonNull
  public final RelativeLayout errorLayout;

  @NonNull
  public final RelativeLayout linearlayout00;

  @NonNull
  public final RecyclerView recyclerview10;

  @NonNull
  public final Toolbar toolbar;

  protected FragmentListBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, AppBarLayout appbar, ProgressBar bar, RelativeLayout errorLayout,
      RelativeLayout linearlayout00, RecyclerView recyclerview10, Toolbar toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appbar = appbar;
    this.bar = bar;
    this.errorLayout = errorLayout;
    this.linearlayout00 = linearlayout00;
    this.recyclerview10 = recyclerview10;
    this.toolbar = toolbar;
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentListBinding>inflate(inflater, com.piotr.xapo.R.layout.fragment_list, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentListBinding>inflate(inflater, com.piotr.xapo.R.layout.fragment_list, null, false, component);
  }

  public static FragmentListBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentListBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentListBinding)bind(component, view, com.piotr.xapo.R.layout.fragment_list);
  }
}
