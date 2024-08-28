package com.myapp.logging

import kotlin.test.Test
import kotlin.test.assertEquals

class CreateLoggerTest {

  @Test
  fun `createLogger 는 올바른 클래스 명을 가진 로거 인스턴스를 생성해야한다`() {
    val log = createLogger {}

    assertEquals("com.myapp.logging.CreateLoggerTest", log.name)
  }
}
