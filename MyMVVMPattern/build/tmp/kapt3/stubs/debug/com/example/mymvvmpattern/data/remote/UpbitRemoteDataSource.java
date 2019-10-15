package com.example.mymvvmpattern.data.remote;

import java.lang.System;

/**
 * 서버에서 데이터를 가져오는 클래스
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J(\u0010\t\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00070\u00070\u00062\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mymvvmpattern/data/remote/UpbitRemoteDataSource;", "", "upbitService", "Lcom/example/mymvvmpattern/data/remote/UpbitService;", "(Lcom/example/mymvvmpattern/data/remote/UpbitService;)V", "getMarkets", "Lio/reactivex/Single;", "", "Lcom/example/mymvvmpattern/network/MarketResponse;", "getTickers", "Lcom/example/mymvvmpattern/network/TickerResponse;", "kotlin.jvm.PlatformType", "marketList", "", "MyMVVMPattern_debug"})
public final class UpbitRemoteDataSource {
    private final com.example.mymvvmpattern.data.remote.UpbitService upbitService = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.MarketResponse>> getMarkets() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.TickerResponse>> getTickers(@org.jetbrains.annotations.NotNull()
    java.lang.String marketList) {
        return null;
    }
    
    public UpbitRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.data.remote.UpbitService upbitService) {
        super();
    }
}