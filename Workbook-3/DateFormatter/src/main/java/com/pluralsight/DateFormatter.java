package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;


public class DateFormatter {
    public static void main(String[] args) {

        LocalDateTime timeZoneEST = LocalDateTime.now();

        DateTimeFormatter instanceOne = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String DateEX1 = timeZoneEST.format(instanceOne);
        System.out.println(DateEX1);

        DateTimeFormatter instanceTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String DateEX2 = timeZoneEST.format(instanceTwo);
        System.out.println(DateEX2);

        DateTimeFormatter instanceThree = DateTimeFormatter.ofPattern("MMMM dd, yyyy");
        String DateEX3 = timeZoneEST.format(instanceThree);
        System.out.println(DateEX3);

        DateTimeFormatter instanceFive = DateTimeFormatter.ofPattern("HH:mm 'on' dd-MMM-yyyy");
        String DateEX5 = timeZoneEST.format(instanceFive);
        System.out.println(DateEX5);

        /*failed attempt--
        not sure how to fix the GMT however the code itself works

        DateTimeFormatter instanceFour = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");
        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT+0");
        String DateEX4 = timeZoneEST.format(instanceFour);
        System.out.println(DateEX4);

         */






        /*DateFormatter obtainDate = new DateFormatter();
        TimeZone timeZone = TimeZone.getTimeZone("US/Eastern");
        String dateFormat = "MM/dd/yyyy";


        System.out.println(obtainDate.getTodayDate(dateFormat));




        TimeZone timeZoneGMT = TimeZone.getTimeZone("GMT+0"); */


    }
}
