package com.employee_registration.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.employee_registration.entity.Employee;
import com.employee_registration.services.Service;

@Controller
@RequestMapping
public class EmployeeController {
	@Autowired
	Service service;

	@GetMapping("/registrationPage")
	public String registrationPage() {
		return "employee_regis";
	}
	
	@PostMapping("/addEmployee")
	public String addEmployee(@ModelAttribute("Emp") Employee employee,Model model) {
		service.addOneEmployee(employee);
		model.addAttribute("message","Record saved!");
		return "employee_regis";
	}
	@GetMapping("/listAll")
	public String getAllEmployee(Model model) {
		List<Employee> allEmployee = service.getAllEmployee();
		model.addAttribute("emp",allEmployee);
		return "all_employee";
	}
	
	@GetMapping("/deletePage")
	public String deleteEmployee() {
		
		return "delete_employee";
	}
	
	@PostMapping("/delete")
	public String deleteOneEmployee(@RequestParam ("id") long id,Model model) {
		
		String delete = service.deleteOneEmployee(id);
		model.addAttribute("deleteMsg",delete);
		return "delete_employee";
	}
	
	@GetMapping("/updatePage")
	public String updateEmployee() {
		
		return "get_employee_details";
	}
	
	@PostMapping("/getOneEmployee")
	public String getOneEmployee(@RequestParam("id") long id,Model model) {
		
		Employee emp = service.getOneEmployee(id);
		if(emp!=null) {
			model.addAttribute("emp",emp);
			model.addAttribute("msg","Record not found");
			
		}else {
			return "not_found_page";
		}
		return "update_employee";
		
	}
	@PostMapping("/update")
	public String updateOneEmployee(@ModelAttribute("emp") Employee employee,Model model) {
		service.updateOneEmployee(employee);
		
		model.addAttribute("message","Record Updated !!");
		return"update_employee";
	}
		
}
