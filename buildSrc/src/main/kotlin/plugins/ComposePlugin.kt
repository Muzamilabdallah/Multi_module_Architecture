package plugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION

class ComposePlugin : Plugin<Project> {
    override fun apply(project: Project) {

        // here you will apply plugins
        project.plugins.apply("org.jetbrains.kotlin.android")
        val android = project.extensions.getByName("android")

        if (android is BaseExtension) {


            android.apply {

                buildFeatures.apply {
                    compose = true

                }
                composeOptions {

                    kotlinCompilerExtensionVersion = "1.2.0-beta02"
                }
            }

            //add common shared dependencies here
            project.dependencies {

                //compose
                add(IMPLEMENTATION, "androidx.core:core-ktx:1.7.0")
                add(IMPLEMENTATION, "androidx.compose.ui:ui:${Version.COMPOSE_VERSION}")
                add(IMPLEMENTATION, "androidx.compose.material:material:${Version.COMPOSE_VERSION}")
                add(
                    IMPLEMENTATION,
                    "androidx.compose.ui:ui-tooling-preview:${Version.COMPOSE_VERSION}"
                )
                add(IMPLEMENTATION, "androidx.compose.ui:ui-test-junit4:${Version.COMPOSE_VERSION}")
                add(IMPLEMENTATION, "androidx.compose.ui:ui-tooling:${Version.COMPOSE_VERSION}")

                //lifecycle
                add(IMPLEMENTATION, "androidx.lifecycle:lifecycle-runtime-ktx:2.3.1")
                add(IMPLEMENTATION, "androidx.activity:activity-compose:1.3.1")
                //navigation
                add(
                    CorePlugin.IMPLEMETATION,
                    "androidx.navigation:navigation-compose:${Version.nav_version}"
                )

                add(
                    IMPLEMENTATION,
                    "androidx.lifecycle:lifecycle-viewmodel-ktx:${Version.LIFECYLE_VERSION}"
                )
                // ViewModel utilities for Compose
                add(
                    IMPLEMENTATION,
                    "androidx.lifecycle:lifecycle-viewmodel-compose:${Version.LIFECYLE_VERSION}"
                )

                // LiveData
                add(
                    IMPLEMENTATION,
                    "androidx.lifecycle:lifecycle-livedata-ktx:${Version.LIFECYLE_VERSION}"
                )





            }
        }
    }
}