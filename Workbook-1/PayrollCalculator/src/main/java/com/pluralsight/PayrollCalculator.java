package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Enter hours worked: ");
        double hours = input.nextDouble();
        System.out.println("Enter pay rate: ");
        double rate = input.nextDouble();

        double grossPay;
        if (hours >40) {
            grossPay = 40 * rate + (hours - 40) * 1.5 * rate;
        } else {
            grossPay = hours * rate;
        }

        System.out.println("Name: "+ name);
        System.out.println("Gross pay: $" + String.format("%.2f", grossPay));

        input.close();

    }
}
