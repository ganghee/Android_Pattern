package com.example.mymvvmpattern.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00030\u00060\u0005B\u001b\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u00a2\u0006\u0002\u0010\nJ\b\u0010\u000e\u001a\u00020\bH\u0016J\u001e\u0010\u000f\u001a\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0012\u001a\u00020\bH\u0016J\u001e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\bH\u0016J\u0016\u0010\u0017\u001a\u00020\u00102\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0018R\u0012\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/mymvvmpattern/base/BaseRecyclerViewAdapter;", "ITEM", "", "B", "Landroidx/databinding/ViewDataBinding;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/mymvvmpattern/base/BaseViewHolder;", "layoutRes", "", "bindingId", "(ILjava/lang/Integer;)V", "Ljava/lang/Integer;", "items", "", "getItemCount", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "replaceAll", "", "MyMVVMPattern_debug"})
public abstract class BaseRecyclerViewAdapter<ITEM extends java.lang.Object, B extends androidx.databinding.ViewDataBinding> extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.mymvvmpattern.base.BaseViewHolder<B>> {
    private final java.util.List<ITEM> items = null;
    private final int layoutRes = 0;
    private final java.lang.Integer bindingId = null;
    
    public final void replaceAll(@org.jetbrains.annotations.Nullable()
    java.util.List<? extends ITEM> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.mymvvmpattern.base.BaseViewHolder<B> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.base.BaseViewHolder<B> holder, int position) {
    }
    
    public BaseRecyclerViewAdapter(@androidx.annotation.LayoutRes()
    int layoutRes, @org.jetbrains.annotations.Nullable()
    java.lang.Integer bindingId) {
        super();
    }
}