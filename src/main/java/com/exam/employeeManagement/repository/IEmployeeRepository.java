package com.exam.employeeManagement.repository;

import com.exam.employeeManagement.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
}
