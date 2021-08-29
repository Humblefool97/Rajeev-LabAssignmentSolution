package com.sample.email;

import com.sample.email.model.Employee;

import java.util.*;

/**
 * Takes care of Credential generation & display for [{@link Employee}]
 */
public class CredentialService {
    private final ArrayList<String> validCharacters = new ArrayList<>(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "_", "=", "+", "-", "/", ".", "?", "<", ">", "A", "b", "C", "D", "E", "f", "G", "H", "I", "J", "k", "L", "M", "N", "O", "p", "q", "R", "s", "T", "U", "V", "w", "x", "Y", "z", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));


    public String generateEmail(Employee employee) {
        return new StringBuilder().append(employee.getFirstName()).append(employee.getLastName()).append("@").append(employee.getDepartment()).append(".abc.com").toString();
    }

    public String generatePassword() {
        Collections.shuffle(validCharacters);
        StringBuilder password = new StringBuilder();
        //TODO:Improve on this just to take one pass
        for (int index = 0; index < 7; index++) {
            boolean shouldCaps = new Random().nextBoolean();
            if (shouldCaps) {
                password.append(validCharacters.get(index).toUpperCase());
            } else {
                password.append(validCharacters.get(index).toLowerCase());
            }
        }

        return password.toString();
    }

    public void displayCredentials(String username, String password) {
        System.out.println("Credentials created");
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
    }
}
