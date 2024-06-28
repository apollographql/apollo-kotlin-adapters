pluginManagement {
  listOf(repositories, dependencyResolutionManagement.repositories).forEach {
    it.apply {
      mavenCentral()
      google()
    }
  }
}

include(":apollo-adapters-kotlinx-datetime", ":apollo-adapters-core")