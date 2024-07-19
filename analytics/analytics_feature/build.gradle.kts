plugins {
    alias(libs.plugins.journey.android.dynamic.feature)
    alias(libs.plugins.jetbrainsKotlinAndroid)
}
android {
    namespace = "com.example.analytics.analytics_feature"
    compileSdk = 34
}

dependencies {
    implementation(project(":app"))
    api(projects.analytics.presentation)
    implementation(projects.analytics.domain)
    implementation(projects.analytics.data)
    implementation(projects.core.database)
}