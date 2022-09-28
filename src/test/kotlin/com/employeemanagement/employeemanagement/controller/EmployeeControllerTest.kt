package com.employeemanagement.employeemanagement.controller

import com.employeemanagement.employeemanagement.repository.EmployeeRepository
import com.employeemanagement.employeemanagement.service.EmployeeService
import io.mockk.mockk
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.test.web.reactive.server.WebTestClient

@WebFluxTest(EmployeeController::class)
@AutoConfigureWebTestClient

class EmployeeControllerTest{
    @Autowired
    lateinit var client: WebTestClient

    @Autowired
    lateinit var employeeService: EmployeeService
    @Autowired
    lateinit var employeeRepository: EmployeeRepository

}
  @TestConfiguration
  class ControllerTestConfig {
    @Bean
    fun employeeService() = mockk<EmployeeService>()

    @Bean
    fun employeeRepository() = mockk<EmployeeRepository>()
 }
   @Test
   fun `should create employee`(){


}
