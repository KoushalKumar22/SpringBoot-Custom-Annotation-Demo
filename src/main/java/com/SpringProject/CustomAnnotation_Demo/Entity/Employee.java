package com.SpringProject.CustomAnnotation_Demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name = "Name")
    String name;
    @Column(name = "Address")
    String address;
    @Column(name = "Age")
    int age;

}
