plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.sathvika.optsleep"
    compileSdk = 34 // Updated compileSdk to 34

    defaultConfig {
        applicationId = "com.sathvika.optsleep"
        minSdk = 21
        targetSdk = 34 // Updated targetSdk to 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.3" // Updated to latest version
    }

    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    // Core Android dependencies
    implementation("androidx.core:core-ktx:1.12.0") // Updated to latest version
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0") // Updated to latest version

    // Jetpack Compose dependencies
    implementation("androidx.activity:activity-compose:1.8.0") // Updated to latest version
    implementation("androidx.compose.ui:ui:1.5.3") // Updated to latest version
    implementation("androidx.compose.material:material:1.5.3") // Updated to latest version
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.3")
    implementation("androidx.compose.material3:material3-android:1.3.1") // Updated to latest version
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.3") // Updated to latest version

    // Lifecycle components
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2") // Updated to latest version

    // Google Play Services dependencies (add only what you need)
    implementation("com.google.android.gms:play-services-auth:20.7.0") // For Google Sign-In
    implementation("com.google.android.gms:play-services-fitness:21.1.0") // For Fitness APIs (optional)
    implementation("com.google.android.gms:play-services-maps:18.1.0") // For Google Maps (optional)

    // Kotlin coroutines (if needed for async operations)
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
}
