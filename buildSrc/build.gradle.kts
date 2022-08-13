plugins {
    `kotlin-dsl`

}

repositories {
    mavenCentral()
    mavenLocal()
    google()
}

gradlePlugin {
    plugins {
        register("core_plugin") {
            id = "core_plugin"
            implementationClass = "plugins.CorePlugin"
        }

        register("base_plugin") {
            id = "base_plugin"
            implementationClass = "plugins.BasePlugin"
        }
        register("compose_plugin") {
            id = "compose_plugin"
            implementationClass = "plugins.ComposePlugin"
        }
    }

}
dependencies {
    compileOnly(gradleApi())
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.6.21")
    implementation("com.android.tools.build:gradle:7.1.0")
    implementation("com.google.dagger:hilt-android-gradle-plugin:2.38.1")
    implementation(kotlin("android-extensions"))

}
