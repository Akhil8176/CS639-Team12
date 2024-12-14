// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.1" apply false
    id("org.jetbrains.kotlin.android") version "1.9.10" apply false
    //id("org.jetbrains.kotlin.plugin.compose") version "1.5.2" apply false // Use a compatible Compose version
}

repositories {
    google()
    mavenCentral()
    maven { url = uri("https://jitpack.io") } // If needed
    //maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") } // Add this for Compose
}


