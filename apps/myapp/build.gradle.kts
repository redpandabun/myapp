plugins {
  id("myapp.spring-boot-app")
}

dependencies {
  implementation(project(":core:myapp-logging"))
}
