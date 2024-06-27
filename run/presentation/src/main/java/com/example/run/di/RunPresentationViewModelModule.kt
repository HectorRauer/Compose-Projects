package com.example.run.di

import com.example.run.domain.RunningTracker
import com.example.run.presentation.active_run.ActiveRunViewModel
import com.example.run.presentation.overview.RunOverviewViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

val runViewModelModule = module {
    singleOf(::RunningTracker)
    viewModelOf(::RunOverviewViewModel)
    viewModelOf(::ActiveRunViewModel)
}