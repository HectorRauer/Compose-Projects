plugins {
    alias(libs.plugins.journey.android.library)
}

android {
    namespace = "com.example.analytics.data"

    }


dependencies {
    implementation(libs.kotlinx.coroutines.core)
    implementation(libs.bundles.koin)
    implementation(projects.core.database)
    implementation(projects.core.domain)
    implementation(projects.analytics.domain)
}