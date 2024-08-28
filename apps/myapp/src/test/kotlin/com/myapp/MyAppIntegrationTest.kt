package com.myapp

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertNotNull

@SpringBootTest
class MyAppIntegrationTest {

  @Test
  fun `test 프로필로 실행되어야 한다`(ctx: ApplicationContext) {
    assertContentEquals(arrayOf("test"), ctx.environment.activeProfiles)
  }

  @Test
  fun `애플리케이션은 정상적으로 로드되어야 한다`(ctx: ApplicationContext) {
    assertNotNull(ctx.id)
  }
}
