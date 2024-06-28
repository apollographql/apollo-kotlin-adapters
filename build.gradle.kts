import com.gradleup.librarian.core.librarianRoot

plugins {
  id("org.jetbrains.kotlin.jvm").version("2.0.20-Beta1").apply(false)
  id("com.gradleup.librarian").version("0.0.3").apply(false)
}

librarianRoot()