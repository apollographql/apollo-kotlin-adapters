import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.1.20").apply(false)
  id("com.gradleup.librarian").version("0.0.7").apply(false)
  id("org.jetbrains.kotlinx.binary-compatibility-validator").version("0.18.0").apply(false)
}

Librarian.root(project)
