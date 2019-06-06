package com.tsys;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "employee")
public class EmployeeService {
	@RequestMapping(method = RequestMethod.POST, consumes = "application/json")
	public void create(@RequestBody Employee employee) {
		System.out.println("Employee Created");
	}

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public Employee read() {
		System.out.println("Employeee Read");
		Employee employee = new Employee();
		employee.setId(1L);
		employee.setName("John Doe");
		return employee;
	}

	@RequestMapping(method = RequestMethod.PUT)
	public void update() {
		System.out.println("Employee updated");
	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void delete() {
		System.out.println("Employee Deleted");
	}
}
