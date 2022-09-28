package com.employeemanagement.employeemanagement.service

import com.employeemanagement.employeemanagement.model.Employee
import com.employeemanagement.employeemanagement.repository.EmployeeRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono

@Service
class EmployeeService (
     @Autowired
     val employeeRepository:EmployeeRepository
) {
    fun addEmployee(employee: Employee): Mono<Employee> {
        return employeeRepository.save(employee)
    }
    fun findAllEmployees() : Flux<Employee> {
        return employeeRepository.findAll()
    }
    fun findById(id: String): Mono<Employee>{
        return employeeRepository.findById(id)
    }

    fun updateEmployeeById(id:String, employee: Employee):Mono<Employee>{
        return employeeRepository.save(employee)
    }

    fun deleteById(id: String): Mono<Void> {
        return employeeRepository.deleteById(id)
    }

}