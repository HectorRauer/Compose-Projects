plugins {
    alias(libs.plugins.journey.jvm.library)
}

dependencies {
    implementation(projects.core.domain)
}