plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)
}

android {
    namespace = "com.example.pedestriandistractionapp"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.pedestriandistractionapp"
        minSdk = 30
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.0"
    }
}

dependencies {
    implementation(platform(libs.compose.bom))

    // Jetpack Compose Core
    implementation(libs.ui)
    implementation(libs.ui.graphics)
    implementation(libs.ui.tooling.preview)
    implementation(libs.compose.material)
    implementation(libs.compose.foundation)

    // Wear OS Compose
    implementation("androidx.wear.compose:compose-material:1.2.0")
    implementation("androidx.wear.compose:compose-navigation:1.1.0-alpha05")
    implementation("androidx.wear.tiles:tiles-material:1.2.0-alpha02")
    implementation("androidx.navigation:navigation-compose:2.7.7")


    // Tooling
    implementation(libs.wear.tooling.preview)
    implementation(libs.activity.compose)
    implementation(libs.core.splashscreen)

    // Google Play Services Wearable
    implementation(libs.play.services.wearable)

    // Testing
    androidTestImplementation(platform(libs.compose.bom))
    androidTestImplementation(libs.ui.test.junit4)
    debugImplementation(libs.ui.tooling)
    debugImplementation(libs.ui.test.manifest)
}
//plugins {
//    alias(libs.plugins.android.application)
//    alias(libs.plugins.kotlin.android)
//    alias(libs.plugins.kotlin.compose)
//}
//
//android {
//    namespace = "com.example.pedestriandistractionapp"
//    compileSdk = 34
//
//    defaultConfig {
//        applicationId = "com.example.pedestriandistractionapp"
//        minSdk = 30
//        targetSdk = 34
//        versionCode = 1
//        versionName = "1.0"
//
//    }
//
//    buildTypes {
//        release {
//            isMinifyEnabled = false
//            proguardFiles(
//                getDefaultProguardFile("proguard-android-optimize.txt"),
//                "proguard-rules.pro"
//            )
//        }
//    }
//    compileOptions {
//        sourceCompatibility = JavaVersion.VERSION_11
//        targetCompatibility = JavaVersion.VERSION_11
//
//    }
//    kotlinOptions {
//        jvmTarget = "11"
//    }
//    buildFeatures {
//        compose = true
//    }
//}
//
//
//
//
//dependencies {
//
//    implementation(libs.play.services.wearable)
//    implementation(platform(libs.compose.bom))
//    implementation(libs.ui)
//    implementation(libs.ui.graphics)
//    implementation(libs.ui.tooling.preview)
//    implementation(libs.compose.material)
//    implementation(libs.compose.foundation)
//    implementation(libs.wear.tooling.preview)
//    implementation(libs.activity.compose)
//    implementation(libs.core.splashscreen)
//    androidTestImplementation(platform(libs.compose.bom))
//    androidTestImplementation(libs.ui.test.junit4)
//    debugImplementation(libs.ui.tooling)
////    debugImplementation(libs.ui.test.manifest)
//
//
//
//}