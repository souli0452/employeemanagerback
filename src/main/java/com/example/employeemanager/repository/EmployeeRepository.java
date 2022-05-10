package com.example.employeemanager.repository;

import java.util.Optional;

import com.example.employeemanager.model.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee,Long> {

    Optional<Employee> findEmployeeById(Long id);
}
