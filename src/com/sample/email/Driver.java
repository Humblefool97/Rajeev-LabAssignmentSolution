package com.sample.email;

import com.sample.email.model.Department;
import com.sample.email.model.Employee;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First name:");
        String firstName = sc.next();
        System.out.println("Enter Last name:");
        String lastName = sc.next();
        int dep = -1;
        do {
            displayDepartment();
            dep = sc.nextInt();
            if (dep < 1 && dep > 4) {
                System.out.println("Invalid choice!! Please select depart from the above options!");
            } else {
                break;
            }
        } while (dep >= 1 && dep <= 4);

        String department = Department.getDepartmentFromChoice(dep);
        Employee employee = new Employee(firstName, lastName, department);

        CredentialService credentialService = new CredentialService();
        String generatedEmail = credentialService.generateEmail(employee);
        String generatedPassword = credentialService.generatePassword();
        credentialService.displayCredentials(generatedEmail,generatedPassword);

    }

    private static void displayDepartment() {
        System.out.println("Please enter the department from the following");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resource");
        System.out.println("4.Technical");
    }


}
