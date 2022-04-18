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
    implementation(Dependencies.UIComponents.appCompat)
    implementation(Dependencies.UIComponents.material)
    implementation(Dependencies.UIComponents.constraintLayout)
    implementation(Dependencies.UIComponents.viewBindingPropertyDelegate)

    // Core
    implementation(Dependencies.Core.core)

    // Activity
    implementation(Dependencies.Activity.activity)

    // Fragment
    implementation(Dependencies.Fragment.fragment)

    // Lifecycle
    implementation(libs.lifecycle.runtime )
    implementation(libs.lifecycle.viewModelLifecycle)
    implementation(libs.lifecycle.liveData)

    // Navigation
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.navigationUi)

    // Retrofit
    implementation(libs.retrofit.retrofit)
    implementation(libs.retrofit.gsonConverter)

    // OkHttpClient
    implementation(Dependencies.OkHttp.loggingInterceptor)
    implementation(Dependencies.OkHttp.okHttp)
    implementation(Dependencies.OkHttp.bom)

    // Hilt
    implementation(libs.hilt.hilt)
    kapt(libs.hilt.compiler)

    // Legacy Support
    implementation("androidx.legacy:legacy-support-v4:1.0.0")

    // Glide
    implementation(libs.glide.glide)

    // SplashScreen
    implementation(libs.splashScreen.splashScreen)
    // Room with coroutines
    implementation(libs.room.runtime)
    implementation(libs.room.kotlinExtensionsAndCoroutinesSupport)
    kapt(libs.room.compiler)
}