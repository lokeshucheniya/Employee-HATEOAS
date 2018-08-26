package com.rest.hateoas.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class EmployeeNotFound extends Exception {

	
	private static final long serialVersionUID = 1L;

	public EmployeeNotFound(String exception) {
		super(exception);
	}

}
