package com.exam.employeeManagement.controller;

import com.exam.employeeManagement.entities.Branch;
import com.exam.employeeManagement.entities.Employee;
import com.exam.employeeManagement.service.IBranchService;
import com.exam.employeeManagement.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller()
@RequestMapping("/employees")

public class EmployeeController {
    @Autowired
    private IEmployeeService employeeService;

    @Autowired
    private IBranchService branchService;
    @GetMapping("/index")
    public ModelAndView get(){
        List<Employee> employees = employeeService.get();
        ModelAndView modelAndView = new ModelAndView("employee/index");
        modelAndView.addObject("employees", employees);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create(){
        ModelAndView modelAndView = new ModelAndView("employee/create");
        List<Branch> branches = branchService.get();
        modelAndView.addObject("branches",branches);
        modelAndView.addObject("employee", new Employee());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Employee emp){
        boolean isAdded =  employeeService.create(emp);
        if(isAdded){
            return "index";
        }
        return "create";
    }
}
