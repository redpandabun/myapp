plugins {
  `kotlin-dsl`
}

dependencies {
  implementation(libs.kotlin.gradlePlugin)

  // https://github.com/gradle/gradle/issues/15383
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
