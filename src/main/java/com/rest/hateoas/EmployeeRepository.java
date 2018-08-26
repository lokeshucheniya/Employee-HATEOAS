package com.rest.hateoas;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rest.hateoas.pojo.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
