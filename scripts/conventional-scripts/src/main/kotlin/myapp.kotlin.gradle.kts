val javaVersion: String = libs.versions.java.get()

plugins {
  kotlin("jvm")
}

dependencies {
  implementation(libs.kotlin.stdlib)
  testImplementation(libs.kotlin.test)
}

kotlin {
  jvmToolchain(javaVersion.toInt())

  compilerOptions {
    freeCompilerArgs = properties["kotlin.compiler.free-compiler-args"].toString().split(" ")
  }
}

tasks {
  test {
    useJUnitPlatform()
  }
}
