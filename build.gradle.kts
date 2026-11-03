import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.3.20").apply(false)
  id("com.gradleup.librarian").version("0.2.2-SNAPSHOT-0745232b91f2c72a0fd002b38b66c261dca79c9b").apply(false)
}

Librarian.root(project)
