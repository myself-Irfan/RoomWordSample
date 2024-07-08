// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.jetbrains.kotlin.android) apply false
    alias(libs.plugins.ksp) apply false
}

val activityVersion by extra(libs.versions.activityKtx.get())
val appCompatVersion by extra(libs.versions.appcompat.get())
val constraintLayoutVersion by extra(libs.versions.constraintlayout.get())
val coreTestingVersion by extra(libs.versions.coreKtx.get())
val coroutinesVersion by extra(libs.versions.kotlinxCoroutinesCore.get())
val lifecycleVersion by extra(libs.versions.lifecycleRuntimeKtx.get())
val materialVersion by extra(libs.versions.material.get())
val roomVersion by extra(libs.versions.roomTesting.get())
// testing
val junitVersion by extra(libs.versions.junit.get())
val espressoVersion by extra(libs.versions.espressoCore.get())
val androidxJunitVersion by extra(libs.versions.junitVersion.get())
