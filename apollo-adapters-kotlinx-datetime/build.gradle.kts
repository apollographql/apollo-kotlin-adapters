import com.gradleup.librarian.gradle.librarianModule
import org.jetbrains.kotlin.gradle.targets.js.dsl.ExperimentalWasmDsl

plugins {
  id("org.jetbrains.kotlin.multiplatform")
}
  
librarianModule(true)

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
    nodejs {
      testTask {
        useMocha {
          // Override default 2s timeout
          timeout = "120s"
        }
      }
    }
  }
  @OptIn(ExperimentalWasmDsl::class)
  wasmJs {
    nodejs {
      testTask {
        useMocha {
          // Override default 2s timeout
          timeout = "120s"
        }
      }
    }
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