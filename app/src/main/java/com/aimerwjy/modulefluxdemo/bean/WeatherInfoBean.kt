package com.aimerwjy.modulefluxdemo.bean;

 data class WeatherInfoBean(
    val data: Data,
    val desc: String,
    val status: Int
)

data class Data(
    val city: String,
    val forecast: List<Forecast>,
    val ganmao: String,
    val wendu: String,
    val yesterday: Yesterday
)

data class Forecast(
    val date: String,
    val fengli: String,
    val fengxiang: String,
    val high: String,
    val low: String,
    val type: String
)

data class Yesterday(
    val date: String,
    val fl: String,
    val fx: String,
    val high: String,
    val low: String,
    val type: String
)
