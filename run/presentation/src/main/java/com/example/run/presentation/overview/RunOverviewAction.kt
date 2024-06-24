package com.example.run.presentation.overview

 sealed interface RunOverviewAction {
     data object OnStartRunClick: RunOverviewAction
     data object onLogoutClick: RunOverviewAction
     data object OnAnalyticsClick: RunOverviewAction
}