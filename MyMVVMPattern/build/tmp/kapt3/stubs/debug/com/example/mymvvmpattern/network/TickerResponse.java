package com.example.mymvvmpattern.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\bA\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u00d5\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\b\u0012\u0006\u0010\u001c\u001a\u00020\b\u0012\u0006\u0010\u001d\u001a\u00020\u0017\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u001fJ\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\bH\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\bH\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0003H\u00c6\u0003J\t\u0010E\u001a\u00020\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0017H\u00c6\u0003J\t\u0010H\u001a\u00020\u0003H\u00c6\u0003J\t\u0010I\u001a\u00020\bH\u00c6\u0003J\t\u0010J\u001a\u00020\bH\u00c6\u0003J\t\u0010K\u001a\u00020\u0003H\u00c6\u0003J\t\u0010L\u001a\u00020\bH\u00c6\u0003J\t\u0010M\u001a\u00020\bH\u00c6\u0003J\t\u0010N\u001a\u00020\u0017H\u00c6\u0003J\t\u0010O\u001a\u00020\u0003H\u00c6\u0003J\t\u0010P\u001a\u00020\u0003H\u00c6\u0003J\t\u0010Q\u001a\u00020\u0003H\u00c6\u0003J\t\u0010R\u001a\u00020\bH\u00c6\u0003J\t\u0010S\u001a\u00020\u0003H\u00c6\u0003J\t\u0010T\u001a\u00020\u0003H\u00c6\u0003J\t\u0010U\u001a\u00020\u0003H\u00c6\u0003J\t\u0010V\u001a\u00020\bH\u00c6\u0003J\u008d\u0002\u0010W\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\b2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\b2\b\b\u0002\u0010\u001c\u001a\u00020\b2\b\b\u0002\u0010\u001d\u001a\u00020\u00172\b\b\u0002\u0010\u001e\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010X\u001a\u00020Y2\b\u0010Z\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010[\u001a\u00020\\H\u00d6\u0001J\t\u0010]\u001a\u00020\bH\u00d6\u0001J\u0006\u0010^\u001a\u00020_R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010!R\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010!R\u0016\u0010\f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010&R\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010!R\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0016\u0010\u000f\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010&R\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010!R\u0016\u0010\u0011\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010&R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010!R\u0016\u0010\u0013\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b1\u0010!R\u0016\u0010\u0014\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010!R\u0016\u0010\u0015\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u0010!R\u0016\u0010\u0016\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u0010\u0018\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010&R\u0016\u0010\u0019\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010&R\u0016\u0010\u001a\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010!R\u0016\u0010\u001b\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010&R\u0016\u0010\u001c\u001a\u00020\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b:\u0010&R\u0016\u0010\u001d\u001a\u00020\u00178\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00105R\u0016\u0010\u001e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b<\u0010!\u00a8\u0006`"}, d2 = {"Lcom/example/mymvvmpattern/network/TickerResponse;", "", "accTradePrice", "", "accTradePrice24h", "accTradeVolume", "accTradeVolume24h", "change", "", "changePrice", "changeRate", "highPrice", "highest52WeekDate", "highest52WeekPrice", "lowPrice", "lowest52WeekDate", "lowest52WeekPrice", "market", "openingPrice", "prevClosingPrice", "signedChangePrice", "signedChangeRate", "timestamp", "", "tradeDate", "tradeDateKst", "tradePrice", "tradeTime", "tradeTimeKst", "tradeTimestamp", "tradeVolume", "(DDDDLjava/lang/String;DDDLjava/lang/String;DDLjava/lang/String;DLjava/lang/String;DDDDJLjava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;JD)V", "getAccTradePrice", "()D", "getAccTradePrice24h", "getAccTradeVolume", "getAccTradeVolume24h", "getChange", "()Ljava/lang/String;", "getChangePrice", "getChangeRate", "getHighPrice", "getHighest52WeekDate", "getHighest52WeekPrice", "getLowPrice", "getLowest52WeekDate", "getLowest52WeekPrice", "getMarket", "getOpeningPrice", "getPrevClosingPrice", "getSignedChangePrice", "getSignedChangeRate", "getTimestamp", "()J", "getTradeDate", "getTradeDateKst", "getTradePrice", "getTradeTime", "getTradeTimeKst", "getTradeTimestamp", "getTradeVolume", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "toTicker", "Lcom/example/mymvvmpattern/data/FormatTickers;", "MyMVVMPattern_debug"})
public final class TickerResponse {
    @com.google.gson.annotations.SerializedName(value = "acc_trade_price")
    private final double accTradePrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "acc_trade_price_24h")
    private final double accTradePrice24h = 0.0;
    @com.google.gson.annotations.SerializedName(value = "acc_trade_volume")
    private final double accTradeVolume = 0.0;
    @com.google.gson.annotations.SerializedName(value = "acc_trade_volume_24h")
    private final double accTradeVolume24h = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "change")
    private final java.lang.String change = null;
    @com.google.gson.annotations.SerializedName(value = "change_price")
    private final double changePrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "change_rate")
    private final double changeRate = 0.0;
    @com.google.gson.annotations.SerializedName(value = "high_price")
    private final double highPrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "highest_52_week_date")
    private final java.lang.String highest52WeekDate = null;
    @com.google.gson.annotations.SerializedName(value = "highest_52_week_price")
    private final double highest52WeekPrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "low_price")
    private final double lowPrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "lowest_52_week_date")
    private final java.lang.String lowest52WeekDate = null;
    @com.google.gson.annotations.SerializedName(value = "lowest_52_week_price")
    private final double lowest52WeekPrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "market")
    private final java.lang.String market = null;
    @com.google.gson.annotations.SerializedName(value = "opening_price")
    private final double openingPrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "prev_closing_price")
    private final double prevClosingPrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "signed_change_price")
    private final double signedChangePrice = 0.0;
    @com.google.gson.annotations.SerializedName(value = "signed_change_rate")
    private final double signedChangeRate = 0.0;
    @com.google.gson.annotations.SerializedName(value = "timestamp")
    private final long timestamp = 0L;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "trade_date")
    private final java.lang.String tradeDate = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "trade_date_kst")
    private final java.lang.String tradeDateKst = null;
    @com.google.gson.annotations.SerializedName(value = "trade_price")
    private final double tradePrice = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "trade_time")
    private final java.lang.String tradeTime = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "trade_time_kst")
    private final java.lang.String tradeTimeKst = null;
    @com.google.gson.annotations.SerializedName(value = "trade_timestamp")
    private final long tradeTimestamp = 0L;
    @com.google.gson.annotations.SerializedName(value = "trade_volume")
    private final double tradeVolume = 0.0;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymvvmpattern.data.FormatTickers toTicker() {
        return null;
    }
    
    public final double getAccTradePrice() {
        return 0.0;
    }
    
    public final double getAccTradePrice24h() {
        return 0.0;
    }
    
    public final double getAccTradeVolume() {
        return 0.0;
    }
    
    public final double getAccTradeVolume24h() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getChange() {
        return null;
    }
    
    public final double getChangePrice() {
        return 0.0;
    }
    
    public final double getChangeRate() {
        return 0.0;
    }
    
    public final double getHighPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHighest52WeekDate() {
        return null;
    }
    
    public final double getHighest52WeekPrice() {
        return 0.0;
    }
    
    public final double getLowPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLowest52WeekDate() {
        return null;
    }
    
    public final double getLowest52WeekPrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMarket() {
        return null;
    }
    
    public final double getOpeningPrice() {
        return 0.0;
    }
    
    public final double getPrevClosingPrice() {
        return 0.0;
    }
    
    public final double getSignedChangePrice() {
        return 0.0;
    }
    
    public final double getSignedChangeRate() {
        return 0.0;
    }
    
    public final long getTimestamp() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTradeDate() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTradeDateKst() {
        return null;
    }
    
    public final double getTradePrice() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTradeTime() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTradeTimeKst() {
        return null;
    }
    
    public final long getTradeTimestamp() {
        return 0L;
    }
    
    public final double getTradeVolume() {
        return 0.0;
    }
    
    public TickerResponse(double accTradePrice, double accTradePrice24h, double accTradeVolume, double accTradeVolume24h, @org.jetbrains.annotations.NotNull()
    java.lang.String change, double changePrice, double changeRate, double highPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String highest52WeekDate, double highest52WeekPrice, double lowPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String lowest52WeekDate, double lowest52WeekPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String market, double openingPrice, double prevClosingPrice, double signedChangePrice, double signedChangeRate, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeDate, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeDateKst, double tradePrice, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeTime, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeTimeKst, long tradeTimestamp, double tradeVolume) {
        super();
    }
    
    public final double component1() {
        return 0.0;
    }
    
    public final double component2() {
        return 0.0;
    }
    
    public final double component3() {
        return 0.0;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    public final double component6() {
        return 0.0;
    }
    
    public final double component7() {
        return 0.0;
    }
    
    public final double component8() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double component11() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    public final double component13() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    public final double component15() {
        return 0.0;
    }
    
    public final double component16() {
        return 0.0;
    }
    
    public final double component17() {
        return 0.0;
    }
    
    public final double component18() {
        return 0.0;
    }
    
    public final long component19() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component20() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component21() {
        return null;
    }
    
    public final double component22() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component23() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component24() {
        return null;
    }
    
    public final long component25() {
        return 0L;
    }
    
    public final double component26() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.mymvvmpattern.network.TickerResponse copy(double accTradePrice, double accTradePrice24h, double accTradeVolume, double accTradeVolume24h, @org.jetbrains.annotations.NotNull()
    java.lang.String change, double changePrice, double changeRate, double highPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String highest52WeekDate, double highest52WeekPrice, double lowPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String lowest52WeekDate, double lowest52WeekPrice, @org.jetbrains.annotations.NotNull()
    java.lang.String market, double openingPrice, double prevClosingPrice, double signedChangePrice, double signedChangeRate, long timestamp, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeDate, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeDateKst, double tradePrice, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeTime, @org.jetbrains.annotations.NotNull()
    java.lang.String tradeTimeKst, long tradeTimestamp, double tradeVolume) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}