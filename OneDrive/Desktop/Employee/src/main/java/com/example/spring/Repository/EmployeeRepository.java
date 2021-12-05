package com.example.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.spring.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
