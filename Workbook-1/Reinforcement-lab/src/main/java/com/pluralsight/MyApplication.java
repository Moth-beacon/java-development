package com.pluralsight;

import java.util.Scanner;

public class MyApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = getName(scanner);

        int age = getAge(scanner);

        printout(name, age);

        voterEligibility(age);

        if(name.equals("Alice")) {
            System.out.println("Main user has returned");
        }else{
            System.out.println("Welcome.");
        }

        printMessage(name, age);

        drinkingAge(name, age);

        double number = getNumber(scanner);
        double squareRoot = squareRootSum(number);

        int firstNumber = getFirstNumber(scanner);
        int secondNumber = getSecondNumber(scanner);

        boolean isGreaterThan = isGreaterThan(firstNumber, secondNumber);
        System.out.println(firstNumber + " is greater than " + secondNumber + " : " + isGreaterThan);
        System.out.println("The square root of " + number + " is " + squareRoot);

        String welcomeMessage = (name.equalsIgnoreCase("Eve"))? "You are not welcome " + name + "!": "Welcome, " + name + "!";
        System.out.println(welcomeMessage);
    }
    public static String getName(Scanner scanner){
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        return name;
    }

    public static int getAge(Scanner scanner){
        System.out.println("Enter age: ");

        int age = scanner.nextInt();
        return age;
    }

    public static void printout(String name, int age){
        System.out.println("Name: "+ name + "\nAge: " + age);
    }

    public static void voterEligibility(int age){
        if(age >= 18 ){
            System.out.println("You are old enough to vote!");
        } else {
            System.out.println("You are too young to vote.");
        }
    }

    public static void printMessage(String name, int age){
        System.out.println("Hello " + name + "! You are "+ age + " years old.");

    }
    public static void drinkingAge(String name, int age){
        if(name.equalsIgnoreCase ("Bob") && age >= 21) {
            System.out.println("You are able to drink!");
        }else{
            System.out.println("You're too young to drink.");
        }
    }
    public static double getNumber(Scanner scanner){
        System.out.println("Provide a number");
        int number = scanner.nextInt();
        return scanner.nextDouble();
    }
    public static double squareRootSum(double number){

        return Math.sqrt(number);
    }
    public static int getFirstNumber(Scanner scanner){
        System.out.println("Enter the first number: ");
        return scanner.nextInt();
    }
    public static int getSecondNumber(Scanner scanner){
        System.out.println("Enter the second number: ");
        return scanner.nextInt();
    }

    public static boolean isGreaterThan(int firstNumber, int secondNumber){
        return firstNumber > secondNumber;
    }


}

