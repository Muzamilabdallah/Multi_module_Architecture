import com.android.build.gradle.BaseExtension
import org.gradle.internal.impldep.org.bouncycastle.LICENSE


fun BaseExtension.baseConfig() {

    compileSdkVersion(Version.COMPILE_SDK)

    defaultConfig.apply {

        minSdk = Version.MIN_SDK
        targetSdk = Version.TARGET_SDK
        versionCode(1)
        versionName("1.0")

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }


    compileOptions.apply {
        sourceCompatibility = Version.COMPILE_OPTION
        targetCompatibility = Version.COMPILE_OPTION
    }
    packagingOptions {
        resources.excludes.apply {
           "META-INF/DEPENDENCIES"


        }
    }



    val proguardFile = "proguard-rules.pro"
    buildTypes {
        getByName("release") {
            isMinifyEnabled = true
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                proguardFile
            )
        }

    }





}


