package com.vitzay.task1;
public class Main {
    public static void main(String[] args) {
        Human alex = new Human("Alex", "Alexov", "Alexeev");
        Human ben = new Human("Ben", "Benov");
        System.out.println(alex.getFullName());
        System.out.println(ben.getFullName());
        System.out.println(alex.getShortName());
        System.out.println(ben.getShortName());
    }
}