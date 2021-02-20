package com.exam.employeeManagement.service;

import com.exam.employeeManagement.entities.Branch;

import java.util.List;

public interface IBranchService {
    List<Branch> get();
    boolean remove(int id);
    boolean update(Branch e);
    boolean create(Branch e);
    Branch search(String name);
}
