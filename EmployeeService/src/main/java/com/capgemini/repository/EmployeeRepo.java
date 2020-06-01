package com.capgemini.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.capgemini.Employee;

public interface EmployeeRepo
		extends
			JpaRepositoryImplementation<Employee, Long> {

}
