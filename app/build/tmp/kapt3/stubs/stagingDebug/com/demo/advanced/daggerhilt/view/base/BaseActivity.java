package com.demo.advanced.daggerhilt.view.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH&J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0012\u0010\u0014\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010\u0017\u001a\u00020\u000fH\u0002J0\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u0010$\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H\u0004J\u0012\u0010&\u001a\u00020\u000f2\b\u0010\'\u001a\u0004\u0018\u00010(H\u0014J\u0015\u0010)\u001a\u00028\u00002\u0006\u0010*\u001a\u00020+H$\u00a2\u0006\u0002\u0010,J\u0016\u0010-\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010/H\u0014J\u0016\u00100\u001a\u00020\u000f2\f\u0010.\u001a\b\u0012\u0002\b\u0003\u0018\u00010/H\u0014R\u001b\u0010\u0005\u001a\u00028\u00008FX\u0086\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u00061"}, d2 = {"Lcom/demo/advanced/daggerhilt/view/base/BaseActivity;", "VB", "Landroidx/viewbinding/ViewBinding;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "getBinding", "()Landroidx/viewbinding/ViewBinding;", "binding$delegate", "Lkotlin/Lazy;", "mTAG", "", "getMTAG", "()Ljava/lang/String;", "initView", "", "isEditTextEmpty", "", "editText", "Landroid/widget/EditText;", "isTextViewEmpty", "textView", "Landroid/widget/TextView;", "mInitBasicView", "mManageToolbar", "Lcom/demo/advanced/daggerhilt/databinding/LayoutToolbarBinding;", "title", "isShowMoreButton", "moreOptionIcon", "", "moreOptionItemClickListener", "Lcom/demo/advanced/daggerhilt/interfaces/MoreOptionItemClickListener;", "manageError", "mErrorMessage", "view", "Landroid/view/View;", "messageSnackBar", "message", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setBinding", "layoutInflater", "Landroid/view/LayoutInflater;", "(Landroid/view/LayoutInflater;)Landroidx/viewbinding/ViewBinding;", "startNewActivity", "destinationClass", "Ljava/lang/Class;", "startNewActivityWithFinishPreviewsOne", "app_stagingDebug"})
public abstract class BaseActivity<VB extends androidx.viewbinding.ViewBinding> extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy binding$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String mTAG = null;
    
    public BaseActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final VB getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMTAG() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract VB setBinding(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater layoutInflater);
    
    private final void mInitBasicView() {
    }
    
    public abstract void initView();
    
    protected void startNewActivityWithFinishPreviewsOne(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> destinationClass) {
    }
    
    protected void startNewActivity(@org.jetbrains.annotations.Nullable()
    java.lang.Class<?> destinationClass) {
    }
    
    protected boolean manageError(@org.jetbrains.annotations.NotNull()
    java.lang.String mErrorMessage, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
        return false;
    }
    
    protected boolean isEditTextEmpty(@org.jetbrains.annotations.Nullable()
    android.widget.EditText editText) {
        return false;
    }
    
    protected boolean isTextViewEmpty(@org.jetbrains.annotations.Nullable()
    android.widget.TextView textView) {
        return false;
    }
    
    protected final void messageSnackBar(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void mManageToolbar(@org.jetbrains.annotations.NotNull()
    com.demo.advanced.daggerhilt.databinding.LayoutToolbarBinding binding, @org.jetbrains.annotations.NotNull()
    java.lang.String title, boolean isShowMoreButton, int moreOptionIcon, @org.jetbrains.annotations.Nullable()
    com.demo.advanced.daggerhilt.interfaces.MoreOptionItemClickListener moreOptionItemClickListener) {
    }
}