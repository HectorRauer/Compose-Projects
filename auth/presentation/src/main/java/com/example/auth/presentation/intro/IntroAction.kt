package com.example.auth.presentation.intro

sealed interface IntroAction {
    data object onSignInClick: IntroAction
    data object onSignUpClick: IntroAction
}