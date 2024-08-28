package com.myapp

import com.myapp.logging.createLogger
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.boot.runApplication
import org.springframework.context.event.EventListener
import kotlin.time.toKotlinDuration

@SpringBootApplication
class MyApp {
  private val log = createLogger {}

  @EventListener
  protected fun onReady(e: ApplicationReadyEvent) {
    val startedAt = e.timeTaken.toKotlinDuration()

    log.info { "MyApp is started at $startedAt" }
  }

  companion object {
    @JvmStatic
    fun main(vararg args: String) {
      runApplication<MyApp>(*args)
    }
  }
}
