import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.3.20").apply(false)
  id("com.gradleup.librarian").version("0.2.2-SNAPSHOT-28e1611c0fcd7095d72287661ed0f4a94cc58907").apply(false)
}

Librarian.root(project)
