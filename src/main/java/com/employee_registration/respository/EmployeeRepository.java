package com.employee_registration.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee_registration.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

}
