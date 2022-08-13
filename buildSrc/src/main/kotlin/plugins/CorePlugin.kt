package plugins

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.dependencies

class CorePlugin : Plugin<Project> {
    override fun apply(project: Project) {

        // here you will apply plugins
        project.plugins.apply("kotlin-kapt")
        project.plugins.apply("dagger.hilt.android.plugin")

        //add common shared dependencies here
        project.dependencies {
            add(IMPLEMETATION, Dep.HILT)
            add("kapt", Dep.KAPT)
            add(IMPLEMETATION, Dep.RETROFIT)
            add(IMPLEMETATION, Dep.GSON)
            add(IMPLEMETATION, Dep.COROUTINE)
            add(IMPLEMETATION, Dep.COROUTINE_CORE)


        }


    }


    companion object {
        const val IMPLEMETATION = "implementation"
    }
}



