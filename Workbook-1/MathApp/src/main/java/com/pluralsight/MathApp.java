package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        int bobSalary = 80000;
        int garySalary = 120000;
        double highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The answer is: " + highestSalary);

        double carPrice = 80000;
        double truckPrice = 120000;

        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Lowest price is: " + lowestPrice);

        double circleRadius = 7.25;
        double circleArea = (Math.pow(circleRadius, 2)) * Math.PI;
        System.out.println("Area circle: " + circleArea);

        double squareRoot = 5.0;
        System.out.println("The square root: " + (Math.sqrt(squareRoot)));

        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        System.out.println("The distance between the point is: " + distance);

        double absolute = -3.8;
        double absAbsolute = Math.abs(absolute);
        System.out.println("The absolute value of " +absolute+ " is " + absAbsolute);

        double randomNum = Math.random();
        System.out.println("The random number is: "+randomNum);



    }
}
