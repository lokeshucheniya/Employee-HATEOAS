package com.rest.hateoas.service;

import java.util.List;

import com.rest.hateoas.pojo.Employee;

public interface Service {

	public void addNewEmployee(Employee emp);
	public List<Employee> viewAllEmployee();
	public void deleteEmployee(int empId);
	public void updateEmployee(Employee emp);
	public Employee searchEmployee(int empId);
}
