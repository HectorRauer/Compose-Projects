package com.example.analytics.presentation

import com.example.analytics.domain.AnalyticsValues
import com.example.core.presentation.ui.formatted
import com.example.core.presentation.ui.toFormattedKilometers
import com.example.core.presentation.ui.toFormattedKilometersHour
import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds
import kotlin.time.DurationUnit

fun AnalyticsValues.toAnalyticsDashboardState(): AnalyticsDashboardState {
    return AnalyticsDashboardState(
        totalDistanceRun = (totalDistanceRun / 1000.0).toFormattedKilometers(),
        totalTimeRun = totalTimeRun.toFormattedTotalTime(),
        fastestEverRun = fastestEverRun.toFormattedKilometersHour(),
        avgDistance = (avgDistancePerRun / 1000.0).toFormattedKilometers(),
        avgPace = avgPacePerRun.seconds.formatted(),
    )
}

fun Duration.toFormattedTotalTime(): String {
    val days = toLong(DurationUnit.DAYS)
    val hours = toLong(DurationUnit.HOURS) % 24
    val minutes = toLong(DurationUnit.MINUTES) % 60

    return "${days}d ${hours}h ${minutes}m"
}