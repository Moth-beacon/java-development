package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", "Johnson", 24));
        people.add(new Person("Ben", "Smith", 30));
        people.add(new Person("Chloe", "Williams", 19));
        people.add(new Person("David", "Brown", 45));
        people.add(new Person("Ella", "Jones", 28));
        people.add(new Person("Fiona", "Garcia", 33));
        people.add(new Person("George", "Miller", 22));
        people.add(new Person("Hannah", "Wilson", 40));
        people.add(new Person("Isaac", "Moore", 27));
        people.add(new Person("Julia", "Taylor", 21));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to search (first or last): ");
        String searchName = scanner.nextLine().toLowerCase();

        List<Person> matches = new ArrayList<>();

        for (Person person : people) {
            if (person.getFirstName().toLowerCase().equals(searchName) ||
                    person.getLastName().toLowerCase().equals(searchName)) {
                matches.add(person);
            }
        }

        if (matches.isEmpty()) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Matches:");
            for (Person p : matches) {
                System.out.println(p.getFirstName() + " " + p.getLastName());
            }
        }

        // Average age not asked only given
        int totalAge = 0;
        int maxAge = Integer.MIN_VALUE;
        int minAge = Integer.MAX_VALUE;

        for (Person p : people) {
            int age = p.getAge();
            totalAge += age;
            if (age > maxAge) maxAge = age;
            if (age < minAge) minAge = age;
        }

        double averageAge = (double) totalAge / people.size();
        System.out.println("\nAverage Age: " + averageAge);
        System.out.println("Oldest Age: " + maxAge);
        System.out.println("Youngest Age: " + minAge);

        scanner.close();
    }
}
