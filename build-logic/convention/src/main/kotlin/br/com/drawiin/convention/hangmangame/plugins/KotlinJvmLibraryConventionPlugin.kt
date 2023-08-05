package br.com.drawiin.convention.hangmangame.plugins

import br.com.drawiin.convention.hangmangame.utils.configureKotlinJvm
import org.gradle.api.Plugin
import org.gradle.api.Project

class KotlinJvmLibraryConventionPlugin : Plugin<Project> {
    override fun apply(target: Project) {
        with(target) {
            with(pluginManager) {
                apply("org.jetbrains.kotlin.jvm")
            }
            configureKotlinJvm()
        }
    }
}