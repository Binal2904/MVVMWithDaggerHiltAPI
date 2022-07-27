package com.demo.advanced.daggerhilt.view.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H$J:\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0004J\u0018\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J\u0018\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0004J&\u0010!\u001a\u0004\u0018\u00010\u00122\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%2\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u001a\u0010(\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010&\u001a\u0004\u0018\u00010\'H\u0016J\u0016\u0010)\u001a\u00020\u00102\f\u0010*\u001a\b\u0012\u0002\b\u0003\u0018\u00010+H\u0014J\u001f\u0010\b\u001a\u00028\u00002\u0006\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%H&\u00a2\u0006\u0002\u0010,R\u001c\u0010\u0005\u001a\u00028\u0000X\u0084.\u00a2\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006-"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/base/BaseFragment;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/fragment/app/Fragment;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "setBinding", "(Landroidx/viewbinding/ViewBinding;)V", "Landroidx/viewbinding/ViewBinding;", "isEditTextEmpty", "", "editText", "Landroid/widget/EditText;", "mInitView", "", "view", "Landroid/view/View;", "mManageToolbar", "Lcom/demo/advanced/daggerhilt/databinding/LayoutToolbarBinding;", "title", "", "isShowBackButton", "isShowMoreButton", "moreOptionIcon", "", "moreOptionItemClickListener", "Lcom/demo/advanced/daggerhilt/interfaces/MoreOptionItemClickListener;", "manageError", "mMessage", "messageSnackBar", "strTitle", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "openActivity", "destinationClass", "Ljava/lang/Class;", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;", "app_stagingDebug"})
public abstract class BaseFragment<VB extends androidx.viewbinding.ViewBinding> extends androidx.fragment.app.Fragment {
    protected VB binding;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final VB getBinding() {
        return null;
    }
    
    protected final void setBinding(@org.jetbrains.annotations.NotNull()
    VB p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract VB setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container);
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    protected abstract void mInitView(@org.jetbrains.annotations.NotNull()
    android.view.View view);
    
    protected void openActivity(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> destinationClass) {
    }
    
    protected final void mManageToolbar(@org.jetbrains.annotations.NotNull()
    com.demo.advanced.daggerhilt.databinding.LayoutToolbarBinding binding, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isShowBackButton, boolean isShowMoreButton, int moreOptionIcon, @org.jetbrains.annotations.Nullable()
    com.demo.advanced.daggerhilt.interfaces.MoreOptionItemClickListener moreOptionItemClickListener) {
    }
    
    protected boolean isEditTextEmpty(@org.jetbrains.annotations.Nullable()
    android.widget.EditText editText) {
        return false;
    }
    
    protected boolean manageError(@org.jetbrains.annotations.NotNull()
    java.lang.String mMessage, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    protected final void messageSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String strTitle, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
}