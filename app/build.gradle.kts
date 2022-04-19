plugins {

    // Application
    id("com.android.application")

    // Kotlin
    kotlin("android")

    // Kapt
    kotlin("kapt")

    // Navigation SafeArgs
    id(Dependencies.Navigation.safeArgsPlugin)

    // Hilt
    id(Dependencies.Hilt.plugin)

}

android {
    compileSdk = AndroidConfig.compileSdk

    defaultConfig {
        applicationId = "com.timplifier.cryptocurrencyapp"
        minSdk = AndroidConfig.minSdk
        targetSdk = AndroidConfig.targetSdk
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    //ViewBinding
    buildFeatures.viewBinding = true
}

dependencies {
    // UI Components
    implementation(libs.bundles.uiComponents)

    // Core
    implementation(libs.android.core)

    // Activity
    implementation(libs.fragment.activity)

    // Fragment
    implementation(libs.fragment.fragment)

    // Lifecycle
    implementation(libs.bundles.lifecycleBundle)

    // Navigation
    implementation(libs.bundles.navigationBundle)

    // Retrofit
    implementation(libs.bundles.retrofitBundle)

    // OkHttpClient
    implementation(Dependencies.OkHttp.loggingInterceptor)
    implementation(Dependencies.OkHttp.okHttp)
    implementation(libs.okHttp.bom)

    // Hilt
    implementation(libs.bundles.hiltBundle)

    // Legacy Support
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // Glide
    implementation(libs.glide.glide)

    // SplashScreen
    implementation(libs.ui.splashScreen)

    // Room with coroutines
    implementation(libs.bundles.roomBundle)
}