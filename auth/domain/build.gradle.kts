plugins {
    alias(libs.plugins.journey.jvm.library)
    alias(libs.plugins.journey.jvm.junit5)
}

dependencies {
    implementation(projects.core.domain)
}