val javaVersion: String = libs.versions.java.get()

plugins {
  kotlin("jvm")
}

dependencies {
  implementation(kotlin("stdlib-jdk8"))
  testImplementation(kotlin("test-junit5"))
}

kotlin {
  jvmToolchain(javaVersion.toInt())

  compilerOptions {
    freeCompilerArgs = properties["kotlin.compiler.free-compiler-args"].toString().split(" ")
  }
}
