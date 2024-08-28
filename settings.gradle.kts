@file:Suppress("UnstableApiUsage")

rootProject.name = extra["myapp.artifact-id"] as String

pluginManagement {
  includeBuild("scripts/conventional-scripts")

  repositories {
    gradlePluginPortal()
    mavenCentral()
  }
}

dependencyResolutionManagement {
  repositories {
    mavenCentral()
  }
}

include(
  ":apps:myapp"
)
