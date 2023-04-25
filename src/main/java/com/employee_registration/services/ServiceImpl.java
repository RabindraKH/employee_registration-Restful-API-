package com.employee_registration.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.employee_registration.entity.Employee;
import com.employee_registration.respository.EmployeeRepository;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	EmployeeRepository empRepo;
	
	@Override
	public void addOneEmployee(Employee employee) {
		empRepo.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emp= empRepo.findAll();
		
		return emp;
	}

	@Override
	public String deleteOneEmployee(long id) {
		Optional<Employee> findById = empRepo.findById(id);
		if(findById.isPresent()) {
			empRepo.deleteById(id);
			return "Record Deleted..!";
		}else {
			return"Record not found";
		}
		
	}

	@Override
	public Employee getOneEmployee(long id) {
		Optional<Employee> findById = empRepo.findById(id);
		if(findById.isPresent()) {
			Employee emp=findById.get();
		    return emp;
		}	
		return null;
	}

	@Override
	public void updateOneEmployee(Employee employee) {
		empRepo.save(employee);
	}

}
