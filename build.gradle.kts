import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.1.20").apply(false)
  id("com.gradleup.librarian").version("0.0.9").apply(false)
}

Librarian.root(project)
