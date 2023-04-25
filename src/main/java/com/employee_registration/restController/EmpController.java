package com.employee_registration.restController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee_registration.entity.Employee;
import com.employee_registration.services.Service;

@RestController
public class EmpController {

	@Autowired
	Service service;
	
	@GetMapping("/allEmployee")
	public List<Employee> getAllEmployee(){
		List<Employee> allEmployee = service.getAllEmployee();
		return allEmployee;
	}
	@GetMapping("/getOneEmp/{id}")
	public Employee getOneEmployee(@PathVariable ("id") long id) {
		Employee emp = service.getOneEmployee(id);
		return emp;
	}
	
	@PutMapping("/update")
	public void updateOneEmployee(@RequestBody Employee emp) {
		service.updateOneEmployee(emp);
	}
	
	@DeleteMapping("/delete/{id}")
	public void deleteOneEmployee(@PathVariable("id") long id) {
		service.deleteOneEmployee(id);
	}
	
	@PostMapping("/add")
	public void addOneemployee(@RequestBody Employee emp) {
		service.addOneEmployee(emp);
	}
}
