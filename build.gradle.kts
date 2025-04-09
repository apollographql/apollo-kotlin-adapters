import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.0.0").apply(false)
  id("com.gradleup.librarian").version("0.0.7").apply(false)
}

Librarian.root(project)