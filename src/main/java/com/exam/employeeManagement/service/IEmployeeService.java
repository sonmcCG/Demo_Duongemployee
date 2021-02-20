package com.exam.employeeManagement.service;

import com.exam.employeeManagement.entities.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> get();
    boolean remove(int id);
    boolean update(Employee e);
    boolean create(Employee e);
    Employee search(String name);
}
