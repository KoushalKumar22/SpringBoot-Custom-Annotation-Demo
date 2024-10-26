package com.SpringProject.CustomAnnotation_Demo.Entity;

import com.SpringProject.CustomAnnotation_Demo.Validation.AddressValidation;
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
    @AddressValidation(message = "Enter The Correct City Name")
    String address;
    @Column(name = "Age")
    int age;

    public Employee(int id, String name, String address, int age) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
