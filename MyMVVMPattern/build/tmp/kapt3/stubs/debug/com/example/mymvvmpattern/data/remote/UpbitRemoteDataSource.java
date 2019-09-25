package com.example.mymvvmpattern.data.remote;

import java.lang.System;

/**
 * 서버에서 데이터를 가져오는 클래스
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\u0016J*\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\t \n*\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00060\u00060\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/mymvvmpattern/data/remote/UpbitRemoteDataSource;", "Lcom/example/mymvvmpattern/network/UpbitService;", "()V", "retrofit", "getMarkets", "Lio/reactivex/Single;", "", "Lcom/example/mymvvmpattern/network/MarketResponse;", "getTickers", "Lcom/example/mymvvmpattern/network/TickerResponse;", "kotlin.jvm.PlatformType", "marketList", "", "MyMVVMPattern_debug"})
public final class UpbitRemoteDataSource implements com.example.mymvvmpattern.network.UpbitService {
    private static final com.example.mymvvmpattern.network.UpbitService retrofit = null;
    public static final com.example.mymvvmpattern.data.remote.UpbitRemoteDataSource INSTANCE = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.MarketResponse>> getMarkets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.TickerResponse>> getTickers(@org.jetbrains.annotations.NotNull()
    java.lang.String marketList) {
        return null;
    }
    
    private UpbitRemoteDataSource() {
        super();
    }
}