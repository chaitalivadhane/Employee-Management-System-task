package com.employeemanagement.employeemanagement.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document()
data class Employee(
    @Id
    val employeeId: String?,
    val employeeName: String?,
    val department:String?,
    val mobileNumber: String?,
    val email: String?,
    val salary: String?,
    val address: String?
    )
