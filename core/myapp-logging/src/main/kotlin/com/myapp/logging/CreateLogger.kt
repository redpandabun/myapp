package com.myapp.logging

import io.github.oshai.kotlinlogging.KotlinLogging

/**
 * 이 함수가 선언된 위치의 클래스 명을 가져와서 로거 인스턴스를 생성한다
 *  *
 *  * **사용 예:**
 *  * ```kotlin
 *  * val log = createLogger {}
 * log.info { "Hello world!" }
 * ```
 *
 * @param dummy 로거 이름을 구하기 위한 빈 람다 함수, 함수 안의 내용은 호출되지 않는다.
 * @return 현재 선언된 위치의 클래스 명을 가진 [io.github.oshai.kotlinlogging.KLogger] 인스턴스
 */
fun createLogger(dummy: () -> Unit) = KotlinLogging.logger(dummy)
