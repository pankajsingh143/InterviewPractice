package com.capgemini;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@GetMapping(value = "/employee/{id}")
	public ResponseEntity<Employee> findEmployeeById(
			@PathVariable("id") int id) {
		Employee emp = new Employee();
		emp.setId(id);
		emp.setFirstName("pankaj");
		emp.setLastName("singh");
		emp.setEmail("ps@gmaii.com");
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

	@PostMapping(value = "/employee")
	public ResponseEntity<Employee> saveEmployeeById(
			@RequestBody Employee emp) {
		emp.setId(67);
		emp.setFirstName("pankaj");
		emp.setLastName("singh");
		emp.setEmail("ps@gmaii.com");
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}

}
