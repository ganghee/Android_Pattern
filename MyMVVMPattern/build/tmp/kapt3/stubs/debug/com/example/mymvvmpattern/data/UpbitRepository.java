package com.example.mymvvmpattern.data;

import java.lang.System;

/**
 * 가져온 데이터를 가공하는 클래스
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006J(\u0010\b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\n \u000b*\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\t0\u00062\u0006\u0010\f\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mymvvmpattern/data/UpbitRepository;", "", "upbitService", "Lcom/example/mymvvmpattern/network/UpbitService;", "(Lcom/example/mymvvmpattern/network/UpbitService;)V", "getMarket", "Lio/reactivex/Single;", "", "getTicker", "", "Lcom/example/mymvvmpattern/network/TickerResponse;", "kotlin.jvm.PlatformType", "marketList", "Companion", "MyMVVMPattern_debug"})
public final class UpbitRepository {
    private final com.example.mymvvmpattern.network.UpbitService upbitService = null;
    private static com.example.mymvvmpattern.data.UpbitRepository INSTANCE;
    public static final com.example.mymvvmpattern.data.UpbitRepository.Companion Companion = null;
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.lang.String> getMarket() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.TickerResponse>> getTicker(@org.jetbrains.annotations.NotNull()
    java.lang.String marketList) {
        return null;
    }
    
    public UpbitRepository(@org.jetbrains.annotations.NotNull()
    com.example.mymvvmpattern.network.UpbitService upbitService) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/mymvvmpattern/data/UpbitRepository$Companion;", "", "()V", "INSTANCE", "Lcom/example/mymvvmpattern/data/UpbitRepository;", "getInstance", "upbitService", "Lcom/example/mymvvmpattern/network/UpbitService;", "MyMVVMPattern_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.mymvvmpattern.data.UpbitRepository getInstance(@org.jetbrains.annotations.NotNull()
        com.example.mymvvmpattern.network.UpbitService upbitService) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}