plugins {
    alias(libs.plugins.journey.android.feature.ui)
}

android {
    namespace = "com.example.analytics.presentation"
    compileSdk = 34

}

dependencies {
        implementation(projects.analytics.domain)
}