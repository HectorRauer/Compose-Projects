plugins {
    alias(libs.plugins.journey.android.library)
    alias(libs.plugins.journey.android.room)
}

android {
    namespace = "com.example.core.database"
}

dependencies {
    implementation(libs.org.mongodb.bson)

    implementation(projects.core.domain)
}