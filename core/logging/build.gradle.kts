plugins {
  id("myapp.kotlin")
}

dependencies {
  api(libs.kotlinLogging)
  runtimeOnly(libs.logback.classic)
}
