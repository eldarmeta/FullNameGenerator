package com.pluralsight;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String fullName = scanner.nextLine();

        String[] parts = fullName.toUpperCase().trim().split("\\s+");

        if (parts.length >= 1) {
            System.out.println("First name: " + parts[0]);

        }
        if (parts.length == 2) {
            System.out.println("Middle name: " + parts[1]);

        }
        if (parts.length >= 1) {
            System.out.println("Middle name: " + parts[1]);
            System.out.println("Last name: " + parts[2]);
        }
    }
}