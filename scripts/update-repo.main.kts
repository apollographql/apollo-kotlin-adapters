#!/usr/bin/env kotlin

@file:Repository("https://repo.maven.apache.org/maven2/")
@file:Repository("https://dl.google.com/android/maven2/")
@file:Repository("https://storage.googleapis.com/gradleup/m2")
//@file:Repository("file://~/.m2/repository")
@file:DependsOn("com.gradleup.librarian:librarian-cli:0.2.2-SNAPSHOT-1c533472bcea135931b0823ff39151a5bd83288c")

import com.gradleup.librarian.repo.librarianSetVersion
import com.gradleup.librarian.repo.updateRepo

updateRepo(
    setVersion = {
        librarianSetVersion()
    },
    setVersionInDocs = {
        file("README.md") {
            replaceArtifactVersion("com.apollographql.adapters:apollo-adapters-core")
        }
    },
)
