plugins {
    alias(libs.plugins.journey.android.library)
    alias(libs.plugins.journey.jvm.ktor)
}

android {
    namespace = "com.example.core.data"
}

dependencies {
    implementation(libs.timber)
    implementation(libs.bundles.koin)
    implementation(projects.core.domain)
    implementation(projects.core.database)
}