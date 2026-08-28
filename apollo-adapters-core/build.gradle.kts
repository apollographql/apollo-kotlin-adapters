import com.gradleup.librarian.gradle.Librarian
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.tasks.KotlinNativeCompile

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}

Librarian.module(project)

kotlin {
  jvm()
  macosX64()
  macosArm64()
  iosArm64()
  iosX64()
  iosSimulatorArm64()
  watchosArm32()
  watchosArm64()
  watchosDeviceArm64()
  watchosSimulatorArm64()
  tvosArm64()
  tvosX64()
  tvosSimulatorArm64()
  js(IR) {
    nodejs()
  }
  @OptIn(org.jetbrains.kotlin.gradle.ExperimentalWasmDsl::class)
  wasmJs {
    nodejs()
  }

  @OptIn(ExperimentalKotlinGradlePluginApi::class)
  applyDefaultHierarchyTemplate {
    group("common") {
      group("jsCommon") {
        group("js") {
          withJs()
        }
        group("wasmJs") {
          withWasmJs()
        }
      }
    }
  }

  sourceSets {
    getByName("commonMain") {
      dependencies {
        api(libs.apollo.api)
      }
    }

    findByName("jsCommonMain")?.apply {
      dependencies {
        implementation(npm("big.js", "5.2.2"))
      }
    }
    getByName("commonTest") {
      dependencies {
        implementation(libs.kotlin.test)
      }
    }
  }
}

kotlin {
  compilerOptions {
    freeCompilerArgs.add("-Xexpect-actual-classes")
  }
}

tasks.withType<KotlinNativeCompile>().configureEach {
  compilerOptions {
    freeCompilerArgs.add("-opt-in=kotlinx.cinterop.UnsafeNumber")
  }
}
