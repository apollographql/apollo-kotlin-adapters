import com.gradleup.librarian.gradle.Librarian

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.1.20").apply(false)
  id("com.gradleup.librarian").version("0.2.2-SNAPSHOT-28e0ecde1aebd3f17f838e056afd44eddbce2544").apply(false)
}

Librarian.root(project)
