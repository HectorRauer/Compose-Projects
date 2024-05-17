plugins {
    alias(libs.plugins.journey.android.library)
    alias(libs.plugins.journey.jvm.ktor)
}

android {
    namespace = "com.example.run.network"
}

dependencies {
    implementation(projects.core.domain)
    implementation(projects.core.data)
}