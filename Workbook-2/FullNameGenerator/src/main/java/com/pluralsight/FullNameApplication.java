package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName = input.nextLine().trim();

        System.out.println("Enter middle name: ");
        String middleName = input.nextLine().trim();

        System.out.println("Enter last name: ");
        String lastName = input.nextLine().trim();

        System.out.println("Enter suffix if applicable: ");
        String suffix = input.nextLine().trim();

        String fullName = generateFullName(firstName, middleName, lastName,suffix);
        System.out.println("\nFull name: " + fullName);

    }
    public static String generateFullName(String first, String middle, String last, String suffix){
        String fullName = first;

        if (!middle.isEmpty()){
            fullName = fullName + " " + last;

            if(!suffix.isEmpty()){
                fullName = fullName + ", "+ suffix;
            }


        }

        return fullName;
    }
}
