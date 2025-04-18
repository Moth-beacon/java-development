package com.pluralsight;

import java.util.Scanner;

public class AdressBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please provide the following information: \n");
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("\nBilling Street: ");
        String streetName = scanner.nextLine();

        System.out.print("Billing City: ");
        String cityName = scanner.nextLine();

        System.out.print("Billing State: ");
        String stateName = scanner.nextLine();

        System.out.print("Billing zip: ");
        String zipName = scanner.nextLine();

        System.out.print("\nShipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping city: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        StringBuilder adressBuilder = new StringBuilder();

        adressBuilder.append(fullName).append("\n\n");
        adressBuilder.append("Billing Address: ").append("\n");
        adressBuilder.append(streetName).append("\n");
        adressBuilder.append(cityName).append(", ").append(stateName)
                .append(zipName).append("\n\n");







    }
}
