plugins {
  id("myapp.kotlin")
  id("myapp.spring-boot-base")
}

dependencies {
  implementation(libs.spring.boot.starter.actuator)
}
