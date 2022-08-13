plugins {
    id ("com.android.library")
    id("base_plugin")
    id("core_plugin")
    id("compose_plugin")
}



dependencies {
    implementation(project(":domain"))
    implementation(project(":core"))


}