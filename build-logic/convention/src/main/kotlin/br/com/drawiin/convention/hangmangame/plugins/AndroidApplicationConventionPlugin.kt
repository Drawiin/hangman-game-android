package br.com.drawiin.convention.hangmangame.plugins

import br.com.drawiin.convention.hangmangame.utils.configureGradleManagedDevices
import br.com.drawiin.convention.hangmangame.utils.configureKotlinAndroid
import br.com.drawiin.convention.hangmangame.utils.configurePrintApksTask
import br.com.drawiin.convention.hangmangame.utils.libs
import com.android.build.api.dsl.ApplicationExtension
import com.android.build.api.variant.ApplicationAndroidComponentsExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class AndroidApplicationConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("com.android.application")
                apply("org.jetbrains.kotlin.android")
            }

            extensions.configure<ApplicationExtension> {
                configureKotlinAndroid(this)
                defaultConfig.targetSdk = libs.findVersion("android-sdk-target").get().toString().toInt()
                configureGradleManagedDevices(this)
            }
            extensions.configure<ApplicationAndroidComponentsExtension> {
                configurePrintApksTask(this)
            }
        }
    }

}