package com.example.mymvvmpattern.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007\u001a\u0014\u0010\u0006\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u001a\u0014\u0010\f\u001a\u00020\u0001*\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\r"}, d2 = {"replaceAll", "", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "", "setChangeRate", "Landroid/widget/TextView;", "tickers", "Lcom/example/mymvvmpattern/data/FormatTickers;", "setMarket", "setTradePrice", "setTradePrice24th", "MyMVVMPattern_debug"})
public final class AdapterUtilKt {
    
    @androidx.databinding.BindingAdapter(value = {"replaceAll"})
    public static final void replaceAll(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$replaceAll, @org.jetbrains.annotations.Nullable()
    java.util.List<? extends java.lang.Object> list) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"market"})
    public static final void setMarket(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setMarket, @org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.FormatTickers tickers) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tradePrice"})
    public static final void setTradePrice(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTradePrice, @org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.FormatTickers tickers) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"changeRate"})
    public static final void setChangeRate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setChangeRate, @org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.FormatTickers tickers) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"tradePrice24th"})
    public static final void setTradePrice24th(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setTradePrice24th, @org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.FormatTickers tickers) {
    }
}