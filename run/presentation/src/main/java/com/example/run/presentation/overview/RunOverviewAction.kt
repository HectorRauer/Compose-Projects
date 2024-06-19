package com.example.run.presentation.overview

 sealed interface RunOverviewAction {
     data object OnStartRun: RunOverviewAction
     data object onLogoutClick: RunOverviewAction
     data object OnAnalyticsClick: RunOverviewAction
}