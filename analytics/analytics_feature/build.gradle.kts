plugins {
    alias(libs.plugins.journey.android.dynamic.feature)
}
android {
    namespace = "com.example.analytics.analytics_feature"
}

dependencies {
    implementation(project(":app"))
    api(projects.analytics.presentation)
    implementation(libs.androidx.navigation.compose)
    implementation(projects.analytics.domain)
    implementation(projects.analytics.data)
    implementation(projects.core.database)
    implementation(libs.androidx.activity.ktx)
    implementation(libs.bundles.koin)
    implementation(project(":core:presentation:designsystem"))
}