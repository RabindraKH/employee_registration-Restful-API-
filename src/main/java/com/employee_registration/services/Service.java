package com.employee_registration.services;

import java.util.List;

import org.springframework.ui.Model;

import com.employee_registration.entity.Employee;

public interface Service {

	public void addOneEmployee(Employee employee);

	public List <Employee>getAllEmployee();

	public String deleteOneEmployee(long id);

	public Employee getOneEmployee(long id);

	public void updateOneEmployee(Employee employee);


}
