package com.example.restservice;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeesController {

	@GetMapping("/employees")
	List<Employee> all() {
		return Employee.lista;
	}

	@PostMapping("/employees")
	Employee newEmployee(@RequestBody Employee newEmployee) {
		Employee.lista.add(newEmployee);
		return newEmployee;
	}

	@GetMapping("/employees/{id}")
	Employee one(@PathVariable Long id) {

		return Employee.findById(id);
	}

	@PutMapping("/employees/{id}")
	Employee replaceEmployee(@RequestBody Employee newEmployee, @PathVariable Long id) {
		Employee e = Employee.findById(id);
		e.setName(newEmployee.getName());
		e.setJobPosition(newEmployee.getJobPosition());
		return e;
	}

	@DeleteMapping("/employees/{id}")
	void deleteEmployee(@PathVariable Long id) {
		Employee.delete(id);
	}

}
