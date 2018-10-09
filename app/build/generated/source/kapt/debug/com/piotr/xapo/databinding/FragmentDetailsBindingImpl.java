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
        sViewsWithIds.put(R.id.appbar, 12);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 13, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.support.design.widget.AppBarLayout) bindings[12]
            , (android.support.design.widget.CollapsingToolbarLayout) bindings[1]
            , (android.support.design.widget.CoordinatorLayout) bindings[0]
            , (de.hdodenhof.circleimageview.CircleImageView) bindings[2]
            , (android.support.v7.widget.Toolbar) bindings[3]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[6]
            );
        this.collapsing.setTag(null);
        this.detailsRoot.setTag(null);
        this.ivProfile.setTag(null);
        this.toolbar.setTag(null);
        this.tvAuthor.setTag(null);
        this.tvDescription.setTag(null);
        this.tvForks.setTag(null);
        this.tvImageUrl.setTag(null);
        this.tvLanguage.setTag(null);
        this.tvPeriodStars.setTag(null);
        this.tvStars.setTag(null);
        this.tvUrl.setTag(null);
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
        if (BR.repository == variableId) {
            setRepository((com.piotr.xapo.model.Repository) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setRepository(@Nullable com.piotr.xapo.model.Repository Repository) {
        this.mRepository = Repository;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.repository);
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
        java.lang.String repositoryAuthor = null;
        java.lang.String integerToStringRepositoryStars = null;
        com.piotr.xapo.model.Repository repository = mRepository;
        int repositoryStars = 0;
        java.lang.String repositoryUrl = null;
        int repositoryCurrentPeriodStars = 0;
        java.lang.String integerToStringRepositoryCurrentPeriodStars = null;
        java.lang.String repositoryImageUrl = null;
        java.lang.String repositoryName = null;
        java.lang.String integerToStringRepositoryForks = null;
        java.lang.String repositoryDescription = null;
        java.lang.String repositoryLanguage = null;
        int repositoryForks = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (repository != null) {
                    // read repository.author
                    repositoryAuthor = repository.getAuthor();
                    // read repository.stars
                    repositoryStars = repository.getStars();
                    // read repository.url
                    repositoryUrl = repository.getUrl();
                    // read repository.currentPeriodStars
                    repositoryCurrentPeriodStars = repository.getCurrentPeriodStars();
                    // read repository.imageUrl
                    repositoryImageUrl = repository.getImageUrl();
                    // read repository.name
                    repositoryName = repository.getName();
                    // read repository.description
                    repositoryDescription = repository.getDescription();
                    // read repository.language
                    repositoryLanguage = repository.getLanguage();
                    // read repository.forks
                    repositoryForks = repository.getForks();
                }


                // read Integer.toString(repository.stars)
                integerToStringRepositoryStars = java.lang.Integer.toString(repositoryStars);
                // read Integer.toString(repository.currentPeriodStars)
                integerToStringRepositoryCurrentPeriodStars = java.lang.Integer.toString(repositoryCurrentPeriodStars);
                // read Integer.toString(repository.forks)
                integerToStringRepositoryForks = java.lang.Integer.toString(repositoryForks);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            this.collapsing.setTitle(repositoryName);
            com.piotr.xapo.Utils.ImageBindingAdapter.setImageUrl(this.ivProfile, repositoryImageUrl);
            this.toolbar.setTitle(repositoryName);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvAuthor, repositoryAuthor);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, repositoryDescription);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvForks, integerToStringRepositoryForks);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvImageUrl, repositoryImageUrl);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvLanguage, repositoryLanguage);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvPeriodStars, integerToStringRepositoryCurrentPeriodStars);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvStars, integerToStringRepositoryStars);
            android.databinding.adapters.TextViewBindingAdapter.setText(this.tvUrl, repositoryUrl);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): repository
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}