plugins {
  id("myapp.kotlin")
  kotlin("plugin.spring")

  id("org.springframework.boot")
}

dependencies {
  implementation(libs.kotlin.reflect)
  developmentOnly(libs.spring.boot.devtools)
  testImplementation(libs.spring.boot.starter.test)
}

tasks {
  test {
    systemProperties["spring.profiles.active"] = "test"
  }
}
