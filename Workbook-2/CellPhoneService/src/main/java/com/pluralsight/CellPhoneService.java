package com.pluralsight;

import java.util.Scanner;

public class CellPhoneService {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        CellPhone123 firstPhone = new CellPhone123();

        System.out.print("What is your serial number: ");
        int serialNumber = scanner.nextInt();
        firstPhone.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone: ");
        String phoneModel = scanner.nextLine();
        firstPhone.setModel(phoneModel);

        System.out.print("Who is the carrier: ");
        String phoneCarrier = scanner.nextLine();
        firstPhone.setCarrier(phoneCarrier);


        System.out.print("What is the phone number: ");
        String phoneNumber = scanner.nextLine();
        firstPhone.setPhoneNumber(phoneNumber);


        System.out.print("Who is the owner of the phone: ");
        String ownerName = scanner.nextLine();
        firstPhone.setOwner(ownerName);

    }
}
