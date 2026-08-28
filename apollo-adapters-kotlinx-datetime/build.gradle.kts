import com.gradleup.librarian.gradle.Librarian
import org.jetbrains.kotlin.gradle.ExperimentalWasmDsl

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
        api(libs.apollo.api)
        api(libs.kotlinx.datetime)
      }
    }

    getByName("commonTest") {
      dependencies {
        implementation(libs.kotlin.test)
      }
    }
  }
}