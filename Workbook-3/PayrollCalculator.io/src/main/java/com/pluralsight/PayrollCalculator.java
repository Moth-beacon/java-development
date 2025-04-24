package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of the employee file to process: ");
        String inputFileName = scanner.nextLine();

        System.out.print("Enter the name of the payroll file to create: ");
        String outputFileName = scanner.nextLine();

        try {
            BufferedReader employeeFileReader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter payrollWriter = new BufferedWriter(new FileWriter(outputFileName));

            String employeeRecord;

            payrollWriter.write("id|name|gross pay");
            payrollWriter.newLine();

            while ((employeeRecord = employeeFileReader.readLine()) != null) {
                String[] employeeFields = employeeRecord.split("\\|");

                int id = Integer.parseInt(employeeFields[0]);
                String fullName = employeeFields[1];
                double hours = Double.parseDouble(employeeFields[2]);
                double rate = Double.parseDouble(employeeFields[3]);

                Employee currentEmployee = new Employee(id, fullName, hours, rate);

                String lineToWrite = String.format("%d|%s|%.2f", currentEmployee.getEmployeeId(),
                        currentEmployee.getName(), currentEmployee.getGrossPay());

                payrollWriter.write(lineToWrite);
                payrollWriter.newLine();
            }

            employeeFileReader.close();
            payrollWriter.close();

            System.out.println("Payroll file created successfully!");

        } catch (IOException e) {
            System.out.println("Couldn't read or write the file. Please check the filenames or paths.");
        } catch (NumberFormatException e) {
            System.out.println("There was a problem converting numbers. Please check the data format.");
        }
    }
}