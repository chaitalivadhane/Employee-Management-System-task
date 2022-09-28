package com.employeemanagement.employeemanagement.repository

import com.employeemanagement.employeemanagement.model.Employee
import org.springframework.data.mongodb.repository.ReactiveMongoRepository
import org.springframework.stereotype.Repository

@Repository
interface EmployeeRepository:ReactiveMongoRepository<Employee,String> {

}