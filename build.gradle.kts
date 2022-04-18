buildscript {
    repositories {
        google()
        mavenCentral()
    }

    dependencies {
        val libs = project.extensions.getByType<VersionCatalogsExtension>()
            .named("libs") as org.gradle.accessors.dm.LibrariesForLibs
        classpath(libs.kotlin.gradle)
        classpath(libs.android.gradle)
        classpath(libs.hilt.gradle)
        classpath(libs.navigation.safeArgsGradle)
    }
}
