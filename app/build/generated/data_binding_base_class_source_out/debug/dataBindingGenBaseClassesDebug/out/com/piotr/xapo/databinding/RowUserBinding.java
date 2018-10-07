package com.piotr.xapo.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.piotr.xapo.model.User;
import de.hdodenhof.circleimageview.CircleImageView;

public abstract class RowUserBinding extends ViewDataBinding {
  @NonNull
  public final CircleImageView ivProfile;

  @NonNull
  public final TextView textview10;

  @Bindable
  protected User mUser;

  protected RowUserBinding(DataBindingComponent _bindingComponent, View _root, int _localFieldCount,
      CircleImageView ivProfile, TextView textview10) {
    super(_bindingComponent, _root, _localFieldCount);
    this.ivProfile = ivProfile;
    this.textview10 = textview10;
  }

  public abstract void setUser(@Nullable User user);

  @Nullable
  public User getUser() {
    return mUser;
  }

  @NonNull
  public static RowUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RowUserBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RowUserBinding>inflate(inflater, com.piotr.xapo.R.layout.row_user, root, attachToRoot, component);
  }

  @NonNull
  public static RowUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static RowUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<RowUserBinding>inflate(inflater, com.piotr.xapo.R.layout.row_user, null, false, component);
  }

  public static RowUserBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static RowUserBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (RowUserBinding)bind(component, view, com.piotr.xapo.R.layout.row_user);
  }
}
