package plugins

import com.android.build.gradle.BaseExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import baseConfig
import org.gradle.kotlin.dsl.dependencies
import org.jetbrains.kotlin.gradle.utils.IMPLEMENTATION

class BasePlugin : Plugin<Project> {
    override fun apply(project: Project) {
        project.plugins.apply("org.jetbrains.kotlin.android")
        val android = project.extensions.getByName("android")

        if (android is BaseExtension) {
            android.apply {
                //add common shared config here
                baseConfig()

            }

        }


        project.dependencies {
            //unit testing
            add(IMPLEMENTATION, "junit:junit:4.13.2")
            add(IMPLEMENTATION, "androidx.test.ext:junit:1.1.3")
            add(IMPLEMENTATION, "androidx.test.espresso:espresso-core:3.4.0")


        }
    }

}