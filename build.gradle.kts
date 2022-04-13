buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        classpath(Dependencies.Gradle.gradlePlugin)
        classpath(Dependencies.Kotlin.kotlinGradle)
        classpath(Dependencies.Hilt.gradlePlugin)
        classpath(Dependencies.Navigation.safeArgsGradlePlugin)
    }
}