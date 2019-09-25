package com.example.mymvvmpattern.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0002J\u0012\u0010\f\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0017R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0010"}, d2 = {"Lcom/example/mymvvmpattern/ui/UpbitFragment;", "Lcom/example/mymvvmpattern/base/BaseFragment;", "Lcom/example/mymvvmpattern/databinding/FragmentUpbitBinding;", "()V", "upbitViewModel", "Lcom/example/mymvvmpattern/viewmodel/UpbitViewModel;", "getUpbitViewModel", "()Lcom/example/mymvvmpattern/viewmodel/UpbitViewModel;", "upbitViewModel$delegate", "Lkotlin/Lazy;", "initViewModel", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "MyMVVMPattern_debug"})
public final class UpbitFragment extends com.example.mymvvmpattern.base.BaseFragment<com.example.mymvvmpattern.databinding.FragmentUpbitBinding> {
    private final kotlin.Lazy upbitViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MARKET_NAME = "market name";
    public static final com.example.mymvvmpattern.ui.UpbitFragment.Companion Companion = null;
    
    private final com.example.mymvvmpattern.viewmodel.UpbitViewModel getUpbitViewModel() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"CheckResult"})
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initViewModel() {
    }
    
    public UpbitFragment() {
        super(0);
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/mymvvmpattern/ui/UpbitFragment$Companion;", "", "()V", "MARKET_NAME", "", "newInstance", "Lcom/example/mymvvmpattern/ui/UpbitFragment;", "marketName", "MyMVVMPattern_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mymvvmpattern.ui.UpbitFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String marketName) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}