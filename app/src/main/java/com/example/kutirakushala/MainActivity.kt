plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("com.google.devtools.ksp") // if needed for other libs
}

android {
    namespace = "com.example.kutirakushala"
    compileSdk = 35
    // ... default configs
    buildFeatures {
        compose = true
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.6")
    implementation("androidx.activity:activity-compose:1.9.3")
    implementation(platform("androidx.compose:compose-bom:2024.10.00"))
    implementation("androidx.compose.ui:ui")
    implementation("androidx.compose.ui:ui-tooling-preview")
    implementation("androidx.compose.material3:material3")

    // Gemini AI SDK
    implementation("com.google.ai.client.generativeai:generativeai:0.9.0") // Check latest version

    // For images/network (Coil)
    implementation("io.coil-kt:coil-compose:2.7.0")

    // Navigation
    implementation("androidx.navigation:navigation-compose:2.8.3")

    // Room for local database (offline content)
    implementation("androidx.room:room-runtime:2.6.1")
    implementation("androidx.room:room-ktx:2.6.1")
    ksp("androidx.room:room-compiler:2.6.1")
}