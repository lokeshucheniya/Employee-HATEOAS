package com.rest.hateoas;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rest.hateoas.pojo.Employee;
@SpringBootApplication
public class PracticeApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(EmployeeRepository repository)
	{
		return (args) ->{
			repository.save(new Employee(101,"Sample1",55000));
			repository.save(new Employee(102,"Sample2",55000));
			
			System.out.println("Database initially loaded");
		};
	}
}
