package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Room twin = new Room(2, 150.00, false, false);
        System.out.println("Room Info:");
        System.out.println("-----------");
        System.out.println("Number of beds: " + twin.getNumberOfBeds());
        System.out.println("Price: $" + twin.getPrice());
        System.out.println("Is the room occupied? " + (twin.isOccupied()? "Yes": "No" ));
        System.out.println("Is the room dirty? " + (twin.isDirty()? "Yes": "No" ));
        System.out.println("Is the room available? " + (twin.isAvailable()? "Yes": "No" ));
        System.out.println();

        Reservation getAway = new Reservation("king", 3, true);
        System.out.println("Reservation Info:");
        System.out.println("-----------------");
        System.out.println("Room Type: " + getAway.getRoomType());
        System.out.println("Nights: " + getAway.getNumberOfNights());
        System.out.println("Is it a Weekend? " + (getAway.isWeekend()? "Yes": "No" ));
        System.out.println("Price per Night: $" + getAway.getPrice());
        double total = getAway.getReservationTotal();
        System.out.printf("Total: $ $%.2f%n", total);
        System.out.println();

        Employee frontDesk = new Employee("Moth", "Moth Beacon", "Front Desk", 20.00, 45.0);
        System.out.println("Employee Info:");
        System.out.println("--------------");
        System.out.println("Total Pay: $" + frontDesk.getTotalPay());
        System.out.println("Regular Hours: " + frontDesk.getRegularHours());
        System.out.println("Overtime Hours: " + frontDesk.getOvertimeHours());
    }
}