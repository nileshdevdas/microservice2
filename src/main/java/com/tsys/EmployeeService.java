package com.tsys;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "employee")
public class EmployeeService {
	@RequestMapping(method = RequestMethod.POST)
	public void create() {
		System.out.println("EMployee Created");
	}
	@RequestMapping(method = RequestMethod.GET)
	public void read() {
		System.out.println("Employeee Read");
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
