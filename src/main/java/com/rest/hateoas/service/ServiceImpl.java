package com.rest.hateoas.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rest.hateoas.EmployeeRepository;
import com.rest.hateoas.pojo.Employee;

@Component
public class ServiceImpl implements Service {
	
	@Autowired
	EmployeeRepository repository;
	
	@Override
	
	public void addNewEmployee(Employee emp) {
		
		repository.save(emp);
	}

	@Override
	public List<Employee> viewAllEmployee() {

		return repository.findAll();
	}

	@Override
	public void deleteEmployee(int empId) {
		
		repository.deleteById(empId);
		
	}

	public void updateEmployee(Employee emp) {
		repository.save(emp);
	}

	public Employee searchEmployee(int empId) {
		
		return repository.findById(empId).get();
	}

}
