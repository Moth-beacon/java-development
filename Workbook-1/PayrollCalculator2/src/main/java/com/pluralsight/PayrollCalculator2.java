package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.println("Enter pay rate: ");
        double rate = input.nextDouble();

        double grossPay = grossPaySum(hours,rate);

        printInfo(name,grossPay);

        input.close();

    }

    public static void printInfo(String name, double grossPay){

        System.out.println("Name: " + name);
        System.out.println("Gross pay: $" + String.format("%.2f", grossPay));

    }

    public static double grossPaySum(double hours, double rate) {
        double grossPay;
        if (hours > 40) {
            grossPay = 40 * rate + (hours - 40) * 1.5 * rate;
        } else {
            grossPay = hours * rate;
        }


        return grossPay;
    }


}