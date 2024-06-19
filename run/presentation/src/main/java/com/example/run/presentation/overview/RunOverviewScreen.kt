@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.run.presentation.overview

import androidx.compose.foundation.layout.size
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.presentation.designsystem.AnalyticsIcon
import com.example.core.presentation.designsystem.JourneyTheme
import com.example.core.presentation.designsystem.LogoIcon
import com.example.core.presentation.designsystem.LogoutIcon
import com.example.core.presentation.designsystem.RunIcon
import com.example.core.presentation.designsystem.components.JourneyFloatingActionButton
import com.example.core.presentation.designsystem.components.JourneyScaffold
import com.example.core.presentation.designsystem.components.JourneyToolbar
import com.example.core.presentation.designsystem.components.util.DropDownItem
import com.example.run.presentation.R
import org.koin.androidx.compose.koinViewModel

@Composable
fun RunOverviewScreenRoot(
    viewModel: RunOverviewViewModel = koinViewModel()
) {
    RunOverviewScreen(
        onAction = {}
    )
}

@Composable
private fun RunOverviewScreen(
    onAction: (RunOverviewAction) -> Unit
) {
    val topAppBarState = rememberTopAppBarState()
    val scrollBehavior = TopAppBarDefaults.enterAlwaysScrollBehavior(
        state = topAppBarState
    )

    JourneyScaffold(
        topAppBar = {
            JourneyToolbar(
                showBackButton = false,
                title = stringResource(id = R.string.journey),
                scrollBehavior = scrollBehavior,
                menuItems = listOf(
                    DropDownItem(
                        icon = AnalyticsIcon,
                        title = stringResource(id = R.string.analytics)

                    ),
                    DropDownItem(
                        icon = LogoutIcon,
                        title = stringResource(id = R.string.logout)

                    )
                ),
                onMenuItemClick = { index ->
                    when (index) {
                        0 -> onAction(RunOverviewAction.OnAnalyticsClick)
                        1 -> onAction(RunOverviewAction.onLogoutClick)
                    }
                },
                startContent = {
                    Icon(
                        imageVector = LogoIcon,
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(30.dp)
                    )
                },
            )
        },
        floatingActionButton = {
            JourneyFloatingActionButton(
                icon = RunIcon,
                onClick = { onAction(RunOverviewAction.OnStartRun)})
        }
    ) { paddingValues ->

    }
}

@Preview
@Composable
private fun RunOverviewScreenPreview() {

    JourneyTheme {
        RunOverviewScreen(
            onAction = {}
        )
    }
}