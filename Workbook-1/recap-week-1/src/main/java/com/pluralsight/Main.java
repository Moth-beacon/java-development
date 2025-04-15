package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Scanner myscanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name  =myscanner.nextLine();

        System.out.println("The name of the user us: " + name); */

        /* float doubleNumber =35.7565f;
        System.out.printf("The rounded number is: %.2f", doubleNumber); */

        int x = 18;
        int y;
        y= x++;
        System.out.println(x);
        System.out.println(y);

        y = ++x;

        System.out.println(x);
        System.out.println(y);
    }
}
