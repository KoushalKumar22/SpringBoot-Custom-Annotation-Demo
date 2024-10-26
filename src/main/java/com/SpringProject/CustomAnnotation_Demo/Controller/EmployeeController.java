package com.SpringProject.CustomAnnotation_Demo.Controller;

import com.SpringProject.CustomAnnotation_Demo.Entity.Employee;
import com.SpringProject.CustomAnnotation_Demo.Respository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping("/test")
    public String test(){
        return "This Is A Test Run";
    }
    @PostMapping("/save")
    public String save(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Data Saved";
    }
    @GetMapping("/all")
    public List<Employee> findAll(){
        return employeeRepository.findAll();
    }
}
