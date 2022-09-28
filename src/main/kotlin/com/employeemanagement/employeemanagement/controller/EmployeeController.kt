package com.employeemanagement.employeemanagement.controller

import com.employeemanagement.employeemanagement.model.Employee
import com.employeemanagement.employeemanagement.repository.EmployeeRepository
import com.employeemanagement.employeemanagement.service.EmployeeService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/v1")
class EmployeeController (
    val employeeRepository: EmployeeRepository,
    val employeeService: EmployeeService
        )
{
    @PostMapping("/employees/add")
    fun save(@RequestBody employee:Employee):Mono<Employee>{
        return employeeService.addEmployee(employee)
    }
    @GetMapping("/employee/list")
    fun getAllEmployees():Flux<Employee>{
        return employeeService.findAllEmployees()
    }

    @GetMapping("/employees/{id}")
    fun getEmployeesById(@PathVariable id: String): Mono<Employee> {
        return employeeService.findById(id)
    }
    @PutMapping("/update/{id}")
    fun updateById( @PathVariable id: String,@RequestBody  employee: Employee): Mono<Employee> {
        return employeeService.updateEmployeeById(id,employee)
    }


    @DeleteMapping
    fun delete(): Mono<Void> {
        return employeeRepository.deleteAll()
    }

}