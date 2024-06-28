import com.gradleup.librarian.core.librarianModule
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

  sourceSets {
    getByName("commonMain") {
      dependencies {
        implementation(libs.apollo.api)
        implementation(libs.kotlinx.datetime)
      }
    }

    getByName("commonTest") {
      dependencies {
        implementation(libs.kotlin.test)
      }
    }
  }
}