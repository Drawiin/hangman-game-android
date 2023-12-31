import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

group = "br.com.drawiin.hangmangame.buildlogic"

// Configure the build-logic plugins to target JDK 17
// This matches the JDK used to build the project, and is not related to what is running on device.
java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

tasks.withType<KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = JavaVersion.VERSION_17.toString()
    }
}

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.firebase.crashlytics.gradlePlugin)
    compileOnly(libs.firebase.performance.gradlePlugin)
    compileOnly(libs.kotlin.gradlePlugin)
}

gradlePlugin {
    plugins {
        register("androidApplicationCompose") {
            id = "drawiin.android.application.compose"
            implementationClass = getPlugin("AndroidApplicationComposeConventionPlugin")
        }

        register("androidApplication") {
            id = "drawiin.android.application"
            implementationClass = getPlugin("AndroidApplicationConventionPlugin")
        }
    }
}

fun getPlugin(className: String): String {
    return "br.com.drawiin.convention.hangmangame.plugins.$className"
}