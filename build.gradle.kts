import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.3.20").apply(false)
  id("com.gradleup.librarian").version("0.2.2-SNAPSHOT-51318fc735e5cfc561c7cb41bb22c1d7647d0fdb").apply(false)
}

Librarian.root(project)
