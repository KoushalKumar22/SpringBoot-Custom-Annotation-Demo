package com.SpringProject.CustomAnnotation_Demo.Respository;

import com.SpringProject.CustomAnnotation_Demo.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
}
