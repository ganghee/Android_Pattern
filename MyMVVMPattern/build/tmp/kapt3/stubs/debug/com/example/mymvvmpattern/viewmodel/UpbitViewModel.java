package com.example.mymvvmpattern.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mymvvmpattern/viewmodel/UpbitViewModel;", "Lcom/example/mymvvmpattern/base/BaseViewModel;", "repository", "Lcom/example/mymvvmpattern/data/UpbitRepository;", "(Lcom/example/mymvvmpattern/data/UpbitRepository;)V", "tickerList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/mymvvmpattern/data/FormatTickers;", "getTickerList", "()Landroidx/lifecycle/MutableLiveData;", "getTicker", "", "firstMarket", "", "showFailedUpbitTickerList", "MyMVVMPattern_debug"})
public final class UpbitViewModel extends com.example.mymvvmpattern.base.BaseViewModel {
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.mymvvmpattern.data.FormatTickers>> tickerList = null;
    private final com.example.mymvvmpattern.data.UpbitRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.mymvvmpattern.data.FormatTickers>> getTickerList() {
        return null;
    }
    
    public final void getTicker(@org.jetbrains.annotations.Nullable()
    java.lang.String firstMarket) {
    }
    
    private final void showFailedUpbitTickerList() {
    }
    
    public UpbitViewModel(@org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.UpbitRepository repository) {
        super();
    }
}