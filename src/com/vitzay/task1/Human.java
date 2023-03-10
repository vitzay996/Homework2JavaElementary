package com.vitzay.task1;

public class Human {
    private String firstName;
    private String lastName;
    private String middleName;

    public Human (String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (middleName == null) {
            return firstName + " " + lastName;
        } else {
            return firstName + " " + lastName + " " + middleName;
        }
    }

    public String getShortName() {
        if (middleName == null) {
            return lastName + " " + firstName.charAt(0) + ".";
        } else {
            return lastName + " " + firstName.charAt(0) + ". " + middleName.charAt(0) + ".";
        }
    }
}
