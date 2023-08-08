val ktfmtVersion = "0.44"

initscript {
    val spotlessVersion = "6.20.0"

    repositories {
        mavenCentral()
    }

    dependencies {
        classpath("com.diffplug.spotless:spotless-plugin-gradle:$spotlessVersion")
    }
}

rootProject {
    subprojects {
        apply<com.diffplug.gradle.spotless.SpotlessPlugin>()
        extensions.configure<com.diffplug.gradle.spotless.SpotlessExtension> {
            kotlin {
                target("**/*.kt")
                targetExclude("**/build/**/*.kt")
                ktfmt(ktfmtVersion).dropboxStyle()
            }

            kotlinGradle {
                target("*.gradle.kts").dropboxStyle()
            }
        }
    }
}