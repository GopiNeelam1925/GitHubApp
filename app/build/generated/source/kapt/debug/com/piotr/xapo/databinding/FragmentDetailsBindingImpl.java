package com.piotr.xapo.databinding;
import com.piotr.xapo.R;
import com.piotr.xapo.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 13);
    }
    // views
    @NonNull
    private final android.support.design.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView10;
    @NonNull
    private final android.widget.TextView mboundView11;
    @NonNull
    private final android.widget.TextView mboundView12;
    @NonNull
    private final android.widget.TextView mboundView4;
    @NonNull
    private final android.widget.TextView mboundView5;
    @NonNull
    private final android.widget.TextView mboundView6;
    @NonNull
    private final android.widget.TextView mboundView7;
    @NonNull
    private final android.widget.TextView mboundView8;
    @NonNull
    private final android.widget.TextView mboundView9;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[13]
            , (android.support.design.widget.CollapsingToolbarLayout) bindings[1]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (android.support.v7.widget.Toolbar) bindings[3]
            );
        this.collapsing.setTag(null);
        this.ivProfile.setTag(null);
        this.mboundView0 = (android.support.design.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView10 = (android.widget.TextView) bindings[10];
        this.mboundView10.setTag(null);
        this.mboundView11 = (android.widget.TextView) bindings[11];
        this.mboundView11.setTag(null);
        this.mboundView12 = (android.widget.TextView) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView4 = (android.widget.TextView) bindings[4];
        this.mboundView4.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.mboundView6 = (android.widget.TextView) bindings[6];
        this.mboundView6.setTag(null);
        this.mboundView7 = (android.widget.TextView) bindings[7];
        this.mboundView7.setTag(null);
        this.mboundView8 = (android.widget.TextView) bindings[8];
        this.mboundView8.setTag(null);
        this.mboundView9 = (android.widget.TextView) bindings[9];
        this.mboundView9.setTag(null);
        this.toolbar.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.user == variableId) {
            setUser((com.piotr.xapo.model.User) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setUser(@Nullable com.piotr.xapo.model.User User) {
        this.mUser = User;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.user);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String userFollowingUrl = null;
        java.lang.String userGistsUrl = null;
        java.lang.String userOrganizationsUrl = null;
        java.lang.String userHtmlUrl = null;
        java.lang.String userReposUrl = null;
        java.lang.String userEventsUrl = null;
        java.lang.String userSubscriptionsUrl = null;
        com.piotr.xapo.model.User user = mUser;
        java.lang.String userAvatarUrl = null;
        java.lang.String userFollowersUrl = null;
        java.lang.String userLogin = null;

        if ((dirtyFlags & 0x3L) != 0) {



                if (user != null) {
                    // read user.following_url
                    userFollowingUrl = user.getFollowing_url();
                    // read user.gists_url
                    userGistsUrl = user.getGists_url();
                    // read user.organizations_url
                    userOrganizationsUrl = user.getOrganizations_url();
                    // read user.html_url
                    userHtmlUrl = user.getHtml_url();
                    // read user.repos_url
                    userReposUrl = user.getRepos_url();
                    // read user.events_url
                    userEventsUrl = user.getEvents_url();
                    // read user.subscriptions_url
                    userSubscriptionsUrl = user.getSubscriptions_url();
                    // read user.avatar_url
                    userAvatarUrl = user.getAvatar_url();
                    // read user.followers_url
                    userFollowersUrl = user.getFollowers_url();
                    // read user.login
                    userLogin = user.getLogin();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.collapsing.setTitle(userLogin);
            com.piotr.xapo.Utils.ImageBindingAdapter.setImageUrl(this.ivProfile, userAvatarUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView10, userReposUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView11, userSubscriptionsUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView12, userHtmlUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView4, userLogin);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView5, userEventsUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView6, userFollowersUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView7, userFollowingUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView8, userGistsUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView9, userOrganizationsUrl);
            this.toolbar.setTitle(userLogin);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): user
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}