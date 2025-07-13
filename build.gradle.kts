// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.google.gms.google.services) apply false
    alias(libs.plugins.android.library) apply false
}
buildscript {
    dependencies {
        classpath ("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.20" )// Update to latest stable version
    }
}