package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class PayrollCalculator {
    public static void main(String[] args) {


        try {

            BufferedReader employeeFileReader = new BufferedReader(new FileReader("employees.csv"));
            String employeeRecord;

            while ((employeeRecord = employeeFileReader.readLine()) != null) {
                String[] employeeFields = employeeRecord.split("\\|");

                int id = Integer.parseInt(employeeFields[0]);
                String fullName = employeeFields[1];
                double hours = Double.parseDouble(employeeFields[2]);
                double rate = Double.parseDouble(employeeFields[3]);

                Employee currentEmployee = new Employee(id, fullName, hours, rate);

                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        currentEmployee.getEmployeeId(), currentEmployee.getName(), currentEmployee.getGrossPay());
            }

            employeeFileReader.close();
        } catch (IOException e) {
            System.out.println("Couldn't read the file. Please check the filename or path.");
        } catch (NumberFormatException e) {
            System.out.println("There was a problem converting numbers. Please check the data format.");
        }
    }
}