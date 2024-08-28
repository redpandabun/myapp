plugins {
  `kotlin-dsl`
}

dependencies {
  implementation(libs.gradlePlugin.kotlin)
  implementation(libs.gradlePlugin.kotlin.allopen)
  implementation(libs.gradlePlugin.spring.boot)
  implementation(libs.gradlePlugin.spring.dependencyManagement)

  // https://github.com/gradle/gradle/issues/15383
  implementation(files(libs.javaClass.superclass.protectionDomain.codeSource.location))
}
