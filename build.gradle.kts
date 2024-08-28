group = properties["myapp.group"]!!
version = properties["myapp.version"]!!

plugins {
  idea
}

idea {
  module {
    isDownloadSources = true
    isDownloadJavadoc = true
  }
}
