package com.sample.email.model;

public class Employee {
    private String firstName;
    private String lastName;
    private String department;


    public Employee(String firstName, String lastName,String dep) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = dep;
    }

    public String getDepartment() {
        return department;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
 }
