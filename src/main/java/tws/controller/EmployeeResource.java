package tws.controller;

import java.util.List;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tws.Mapper.EmployeeMapper;
import tws.domain.Employee;

@RestController
public class EmployeeResource {
	@Autowired
	private EmployeeMapper employeeMapper;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Employee addEmployee(@RequestBody Employee employee) {
		 employeeMapper.insertEmployee(employee);
		 return employee;
	}

	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<Employee> searchEmployees() {
		return employeeMapper.searchEmployees();
	}
	
	@PutMapping
	public Employee updateEmployee(@RequestBody Employee employee) {
		employeeMapper.updateEmployee(employee);
		 return employee;
	}
}
