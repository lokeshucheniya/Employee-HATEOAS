package com.rest.hateoas.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@Entity
public class Employee {
	
	
	@Id
	private int empId;
	private String empName;
	private double empSalary;
	

	public Employee() {
		
	}
	
	
	public Employee(int empId, String empName, double empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public void setEmpID(int empId) {
		this.empId = empId;
	}


	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}


	public String getEmpName() {
		return empName;
	}
	public int getEmpId() {
		return empId;
	}
	public double getEmpSalary() {
		return empSalary;
	}


	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", empSalary=" + empSalary + "]";
	}

	}
