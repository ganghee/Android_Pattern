package com.example.mymvppattern.data

data class FormatTickers(
    val toMarket: String,
    val toTradePrice: String,
    val toSignedChangeRate: String,
    val toAccTradePrice24h: String,
    val toRateColor: Int
)