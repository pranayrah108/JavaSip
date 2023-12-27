package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	// dep :
	@Autowired
	private EmployeeService empService;

	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}

	// REST API end point
	// URL : http://localhost:8080/employees/
	// Method : GET
	// resp : List<Emp>
	@GetMapping
	public List<Employee> listAllEmps() {
		System.out.println("in list all emps");
		return empService.getAllEmps();
	}

	// URL : http://localhost:8080/employees/
	// Method : POST
	// resp : Detached Employee
	@PostMapping
	public Employee addEmpDetails(@RequestBody Employee newEmp)
	// @RequestBody : method arg level annotation for un marshalling
	// de-ser (json--> java obj) done by Jackson vendor
	{
		System.out.println("in add emp " + newEmp);
		return empService.addEmpDetails(newEmp);

	}

	// URL : http://localhost:8080/employees/empId
	// Method : DELETE
	// resp : mesg (string)
	@DeleteMapping("/{empId}")
	// @PathVariable => Data binding from incoming URI variable
	// --> method arg
	public String deleteEmpDetails(@PathVariable Long empId) {
		System.out.println("in del emp dtls " + empId);
		return empService.deleteEmpDetails(empId);
	}

	// URL : http://localhost:8080/employees/empId
	// Method : GET
	// resp : detached emp or exc
	@GetMapping("/{empId}")
	public Employee getEmpDetails(@PathVariable Long empId) {
		System.out.println("in get emp dtls " + empId);
		return empService.getEmpDetails(empId);
	}
	// URL : http://localhost:8080/employees
	// Method : PUT
	// payload : detached emp
	// resp : detached emp
	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee emp)
	{
		System.out.println("in update emp details");
		return empService.updateEmpDetails(emp);
	}

}
