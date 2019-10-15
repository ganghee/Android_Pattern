package com.example.mymvvmpattern.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/example/mymvvmpattern/data/remote/UpbitService;", "", "getMarkets", "Lio/reactivex/Single;", "", "Lcom/example/mymvvmpattern/network/MarketResponse;", "getTickers", "Lcom/example/mymvvmpattern/network/TickerResponse;", "markets", "", "MyMVVMPattern_debug"})
public abstract interface UpbitService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "market/all")
    public abstract io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.MarketResponse>> getMarkets();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "ticker")
    public abstract io.reactivex.Single<java.util.List<com.example.mymvvmpattern.network.TickerResponse>> getTickers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "markets")
    java.lang.String markets);
}