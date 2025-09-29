package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

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

        String[] basePart = { firstName, middleName, lastName };

        String fullName = Arrays.stream(basePart)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.joining(" "));

        if (!suffix.isEmpty()) {
            fullName += ", " + suffix;
        }

        System.out.println("Full name: " + fullName);
    }
}
