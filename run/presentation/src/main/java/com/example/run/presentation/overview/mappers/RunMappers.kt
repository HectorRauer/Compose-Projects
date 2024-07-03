package com.example.run.presentation.overview.mappers

import com.example.core.domain.run.Run
import com.example.core.presentation.ui.formatted
import com.example.core.presentation.ui.toFormattedKilometers
import com.example.core.presentation.ui.toFormattedKilometersHour
import com.example.core.presentation.ui.toFormattedMeters
import com.example.core.presentation.ui.toFormattedPace
import com.example.run.presentation.overview.model.RunUi
import java.time.ZoneId
import java.time.format.DateTimeFormatter

fun Run.toRunUi(): RunUi {
    val dateTimeInLocalTime = dateTimeUtc
        .withZoneSameInstant(ZoneId.systemDefault())
    val formattedDateTime = DateTimeFormatter
        .ofPattern("MMM dd, yyyy - hh:mma")
        .format(dateTimeInLocalTime)

    val distanceKm = distanceMeters / 1000.0

    return RunUi(
        id = id!!,
        duration = duration.formatted(),
        dateTime = formattedDateTime,
        distance = distanceKm.toFormattedKilometers(),
        avgSpeed = avgSpeedKmh.toFormattedKilometersHour(),
        maxSpeed = maxSpeedKmh.toFormattedKilometersHour(),
        pace = duration.toFormattedPace(distanceKm),
        totalElevation = totalElevationMeters.toFormattedMeters(),
        mapPictureUrl = mapPictureUrl

    )
}