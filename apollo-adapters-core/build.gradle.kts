import com.gradleup.librarian.core.forEachKotlinCompilerOptions
import com.gradleup.librarian.core.librarianModule
import org.jetbrains.kotlin.gradle.ExperimentalKotlinGradlePluginApi
import org.jetbrains.kotlin.gradle.dsl.KotlinNativeCompilerOptions
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}
  
librarianModule()  

kotlin {
  jvm()
  macosX64()
  macosArm64()
  iosArm64()
  iosX64()
  iosSimulatorArm64()
  watchosArm32()
  watchosArm64()
  watchosSimulatorArm64()
  tvosArm64()
  tvosX64()
  tvosSimulatorArm64()
  js(IR) {
    nodejs()
  }
  @OptIn(ExperimentalWasmDsl::class)
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
        implementation(libs.apollo.api)
      }
    }

    getByName("commonTest") {
      dependencies {
        implementation(libs.kotlin.test)
      }
    }
  }
}

forEachKotlinCompilerOptions {
  freeCompilerArgs.add("-Xexpect-actual-classes")
  if (this is KotlinNativeCompilerOptions) {
    freeCompilerArgs.add("-opt-in=kotlinx.cinterop.UnsafeNumber")
  }
}