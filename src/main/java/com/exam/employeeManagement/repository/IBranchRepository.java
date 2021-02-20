package com.exam.employeeManagement.repository;

import com.exam.employeeManagement.entities.Branch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepository extends JpaRepository<Branch,Long> {
}
