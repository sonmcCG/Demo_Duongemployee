package com.exam.employeeManagement.service.impl;

import com.exam.employeeManagement.entities.Branch;
import com.exam.employeeManagement.repository.IBranchRepository;
import com.exam.employeeManagement.service.IBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService implements IBranchService {
    @Autowired
    private IBranchRepository branchRepository;
    @Override
    public List<Branch> get() {
        return branchRepository.findAll();
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean update(Branch e) {
        return false;
    }

    @Override
    public boolean create(Branch e) {
        return false;
    }

    @Override
    public Branch search(String name) {
        return null;
    }
}
