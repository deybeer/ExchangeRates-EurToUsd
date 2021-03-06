package com.jess.challenge.exchangerates.ui.model

import com.github.mikephil.charting.data.Entry
import com.jess.challenge.exchangerates.domain.model.EuroExchangeEntity

data class EuroChartModel(
    val entries: List<Entry>,
    val exchangeRateList: List<EuroExchangeEntity>,
    var selectedValue: Float,
    var selectedDate: String,
    val maxRate: Float,
    val minRate: Float,
    val avgRate: Float
)