package com.exam.employeeManagement.service.impl;

import com.exam.employeeManagement.entities.Employee;
import com.exam.employeeManagement.repository.IEmployeeRepository;
import com.exam.employeeManagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService implements IEmployeeService {
    @Autowired
    private IEmployeeRepository employeeRepository;

    @Override
    public List<Employee> get() {
        List<Employee> employees = employeeRepository.findAll();
        return employees;
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean update(Employee e) {
        return false;
    }

    @Override
    public boolean create(Employee e) {
        return false;
    }

    @Override
    public Employee search(String name) {
        return null;
    }
}
