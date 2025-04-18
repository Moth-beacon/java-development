package com.pluralsight;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TicketsTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstname = scanner.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = scanner.nextLine();

        System.out.println("What date will you attend? (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        /* String dateFormatting = ""; {
            SimpleDateFormat dateInput = new SimpleDateFormat("MM/DD/YYYY");
            SimpleDateFormat dateOutput = new SimpleDateFormat("YYYY-MM-DD");
        } */

        //I got myself stuck in a loop and lost track of how to use "newDate" then ran out of time


        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate newDate = LocalDate.parse(date, formattedDate);

        System.out.println("How many tickets will you purchase: ");
        int numTickets = scanner.nextInt();

        String ticketEquals = (numTickets == 1) ? "ticket" : "tickets";

        System.out.println(numTickets + " " + ticketEquals + " reserved for " + formattedDate + " under" + lastName + ", "+ firstname);






    }
}
