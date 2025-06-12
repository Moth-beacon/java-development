package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShipperData dao = new ShipperData();

        System.out.println("Enter new shipper company name:");
        String name = scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone = scanner.nextLine();

        int newId = dao.addShipper(new Shipper(name, phone));
        System.out.println("New shipper added with ID: " + newId);

        System.out.println("\nAll shippers:");
        dao.getAllShippers().forEach(System.out::println);

        System.out.println("\nEnter Shipper ID to update phone:");
        int idToUpdate = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new phone number:");
        String newPhone = scanner.nextLine();
        dao.updatePhone(idToUpdate, newPhone);

        System.out.println("\nUpdated list:");
        dao.getAllShippers().forEach(System.out::println);

        System.out.println("\nEnter Shipper ID to delete (not 1–3):");
        int idToDelete = Integer.parseInt(scanner.nextLine());
        dao.deleteShipper(idToDelete);

        System.out.println("\nFinal list:");
        dao.getAllShippers().forEach(System.out::println);
    }
}
