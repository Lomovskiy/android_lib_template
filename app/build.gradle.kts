import com.lomovskiy.lib.template.buildsrc.Config

plugins {
    id("com.android.application")
    id("kotlin-android")
}

android {

    defaultConfig {
        applicationId("com.lomovskiy.lib.template.sample")
        minSdkVersion(Config.Versions.Android.min)
        targetSdkVersion(Config.Versions.Android.target)
        compileSdkVersion(Config.Versions.Android.compile)
        buildToolsVersion(Config.Versions.buildTools)
        versionCode(Config.Versions.code)
        versionName(Config.Versions.name)
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Config.Deps.kotlinStd)
    implementation(Config.Deps.ui)
}