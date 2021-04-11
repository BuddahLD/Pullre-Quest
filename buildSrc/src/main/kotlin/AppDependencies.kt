import org.gradle.api.artifacts.dsl.DependencyHandler

/**
 * [AppDependencies]
 */
// TODO: 11.04.2021 add a doc
object AppDependencies {
    // std lib
    private const val kotlinStdLib = "org.jetbrains.kotlin:kotlin-stdlib-jdk7:${Versions.kotlin}"

    // android ui
    private val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    private val coreKtx = "androidx.core:core-ktx:${Versions.coreKtx}"
    private val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    private val material = "com.google.android.material:material:${Versions.material}"

    // compose
    private val composeUi = "androidx.compose.ui:ui:${Versions.compose}"
    private val composeUiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
    private val composeFoundation = "androidx.compose.foundation:foundation:${Versions.compose}"
    private val composeMaterial = "androidx.compose.material:material:${Versions.compose}"
    private val composeMaterialIconsCore = "androidx.compose.material:material-icons-core:${Versions.compose}"
    private val composeMaterialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
    private val composeActivity = "androidx.activity:activity-compose:${Versions.composeActivity}"
    private val composeLifecycleViewmodel = "androidx.lifecycle:lifecycle-viewmodel-compose:${Versions.composeLifecycleViewmodel}"
    private val composeRuntimeLivedata = "androidx.compose.runtime:runtime-livedata:${Versions.compose}"
    private val composeRuntimeRxJava2 = "androidx.compose.runtime:runtime-rxjava2:${Versions.compose}"
    private val composeUiTestJUnit = "androidx.compose.ui:ui-test-junit4:${Versions.compose}"

    // test libs
    private val junit = "junit:junit:${Versions.junit}"
    private val extJUnit = "androidx.test.ext:junit:${Versions.extJunit}"
    private val espressoCore = "androidx.test.espresso:espresso-core:${Versions.espresso}"

    val appLibs = arrayListOf<String>().apply {
        add(kotlinStdLib)
        add(coreKtx)
        add(appcompat)
        add(constraintLayout)
        add(material)
    }

    val composeLibs = arrayListOf<String>().apply {
        add(composeUi)
        add(composeUiTooling)
        add(composeFoundation)
        add(composeMaterial)
        add(composeMaterialIconsCore)
        add(composeMaterialIconsExtended)
        add(composeActivity)
        add(composeLifecycleViewmodel)
        add(composeRuntimeLivedata)
        add(composeRuntimeRxJava2)
        add(composeUiTestJUnit)
    }

    val androidTestLibraries = arrayListOf<String>().apply {
        add(extJUnit)
        add(espressoCore)
    }

    val testLibraries = arrayListOf<String>().apply {
        add(junit)
    }
}

//util functions for adding the different type dependencies from build.gradle file
fun DependencyHandler.kapt(list: List<String>) {
    list.forEach { dependency ->
        add("kapt", dependency)
    }
}

fun DependencyHandler.implementation(list: List<String>) {
    list.forEach { dependency ->
        add("implementation", dependency)
    }
}

fun DependencyHandler.androidTestImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("androidTestImplementation", dependency)
    }
}

fun DependencyHandler.testImplementation(list: List<String>) {
    list.forEach { dependency ->
        add("testImplementation", dependency)
    }
}
