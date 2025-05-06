package com.pluralsight;

public class Main {
    public static void main(String[] args) {
// Test Employee class
        Employee employee = new Employee(1, "John Doe", "IT", 25.00, 45.00);
        employee.punchIn();
        employee.punchOut();


        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Department: " + employee.getDepartment());
        System.out.println("Employee Pay Rate: " + employee.getPayRate());
        System.out.println("Employee Hours Worked: " + employee.getHoursWorked());
        System.out.println("Employee Total Pay: " + employee.getTotalPay());


        Reservation reservation = new Reservation("king", 3, true);
        System.out.println("\nRoom Type: " + reservation.getRoomType());
        System.out.println("Price per Night: " + reservation.getPrice());
        System.out.println("Number of Nights: " + reservation.getNumberOfNights());
        System.out.println("Is Weekend: " + (reservation.isWeekend()? "Yes": "No" ));
        double total = reservation.getReservationTotal();
        System.out.printf("Total: $ $%.2f%n", total);
        System.out.println();

        Room room = new Room(2, 99.99);
        room.checkIn(); // make it occupied and dirty
        System.out.println("\nRoom after check-in:");
        System.out.println("Is Occupied: " + (room.isOccupied()? "Yes": "No" ));
        System.out.println("Is Dirty: " + (room.isDirty()? "Yes": "No" ));
        System.out.println("Is Available: " + (room.isAvailable()? "Yes": "No" ));

        room.checkOut(); // still dirty
        System.out.println("\nRoom after check-out:");
        System.out.println("Is Occupied: " + (room.isOccupied()? "Yes": "No" ));
        System.out.println("Is Dirty: " + (room.isDirty()? "Yes": "No" ));
        System.out.println("Is Available: " + (room.isAvailable()? "Yes": "No" ));

        room.cleanRoom(); // clean the room
        System.out.println("\nRoom after cleaning:");
        System.out.println("Is Available: " + (room.isAvailable()? "Yes": "No" ));
    }
}