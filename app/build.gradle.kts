plugins {
}

android {
    compileSdk = 30

    defaultConfig {
        applicationId = "com.gmail.danylooliinyk.android.pullrequest"
        minSdk = 21
        targetSdk = 30
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
}

dependencies {

}
