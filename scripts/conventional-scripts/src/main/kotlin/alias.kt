import org.gradle.accessors.dm.LibrariesForLibs
import org.gradle.api.Project
import org.gradle.kotlin.dsl.DependencyHandlerScope
import org.gradle.kotlin.dsl.the

val Project.libs
  get() = this.the<LibrariesForLibs>()

fun DependencyHandlerScope.implementation(dependencyNotation: Any) = add(
  "implementation",
  dependencyNotation
)

fun DependencyHandlerScope.runtimeOnly(dependencyNotation: Any) = add(
  "runtimeOnly",
  dependencyNotation
)

fun DependencyHandlerScope.developmentOnly(dependencyNotation: Any) = add(
  "developmentOnly",
  dependencyNotation
)

fun DependencyHandlerScope.testImplementation(dependencyNotation: Any) = add(
  "testImplementation",
  dependencyNotation
)
