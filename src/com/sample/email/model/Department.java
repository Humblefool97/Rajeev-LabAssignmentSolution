package com.sample.email.model;

public class Department {
    public static String getDepartmentFromChoice(int choice) {
        String dept = "";
        switch (choice) {
            case 1: {
                dept = "tech";
                break;
            }
            case 2: {
                dept = "adm";
                break;
            }
            case 3: {
                dept = "hr";
                break;
            }
            case 4: {
                dept = "lg";
                break;
            }
            default: {
                throw new IllegalArgumentException("Wrong choice!!");
            }
        }

        return dept;
    }
}
