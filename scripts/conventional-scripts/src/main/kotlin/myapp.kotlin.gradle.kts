val javaVersion: String = libs.versions.java.get()

plugins {
  kotlin("jvm")
  id("io.spring.dependency-management")
}

// io.spring.dependency-management
dependencyManagement {
  imports {
    mavenBom(libs.spring.boot.dependencies.get().toString())
  }
}

dependencies {
  implementation(libs.kotlin.stdlib)
  testImplementation(libs.kotlin.test)
}

// kotlin-jvm
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
