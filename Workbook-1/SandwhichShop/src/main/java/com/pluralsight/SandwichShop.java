package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {


        Scanner input  = new Scanner(System.in);

        System.out.println("Would you like regular or large sandwich?");
        String size = input.nextLine().toLowerCase();

        double cost;
        if (size.equals ("regular")) {
            cost = 5.45;
        }
        else if (size.equals("large"))
        {
            cost = 8.95;
        }
        else {
            System.out.println("Invalid Sandwich size. Please input regular or large.");
            return;
        }

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        cost *= ((age <= 17) ? 0.9 : (age >= 65 ? 0.8 : 1.0));

        System.out.printf("Total Due: $%.2f\n", cost);



        //mistakes were made ignore this please//

        /* Scanner rbp = new Scanner(System.in);

        int regular = rbp(sandwichSize);


        int ageCheck;

        System.out.println("Enter your age: ");
        double age = input.nextDouble();

        int child = 17;
        int senior = 65;
        int max = (child > input.nextDouble();
        child = input.nextInt()) ? 64 < senior:
        System.out.println("You are eligible for a discounted price! Total is: $"); */



    }
}
