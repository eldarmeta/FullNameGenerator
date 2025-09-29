package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name");

        System.out.print("First name: ");
        String firstName = sc.nextLine().toUpperCase().trim();

        System.out.print("Middle name: ");
        String middleName = sc.nextLine().toUpperCase().trim();

        System.out.print("Last name: ");
        String lastName = sc.nextLine().toUpperCase().trim();

        System.out.print("Suffix: ");
        String suffix = sc.nextLine().toUpperCase().trim();

        StringBuilder fullName = new StringBuilder(firstName);

        if (!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }
        if (!lastName.isEmpty()){
            fullName.append(" ").append(lastName);
        }
        if (!suffix.isEmpty()){
            fullName.append(" ").append(suffix);
        }

        System.out.println("Full name: " + fullName.toString());


    }
}
