package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double lastPunchInTime;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }


    public double getTotalPay() {
        return getRegularHours() * payRate + getOvertimeHours() * (payRate * 1.5);
    }

    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    public double getOvertimeHours() {
        return Math.max(0, hoursWorked - 40);
    }

    /*
    public void punchIn(double time) {
        lastPunchInTime = time;
    }

    public void punchOut(double time) {
        double worked = time - lastPunchInTime;
        hoursWorked += worked;
        lastPunchInTime = 0;
    }


    public void punchTimeCard(double punchIn, double punchOut) {
        double worked = punchOut - punchIn;
        hoursWorked += worked;
    } */


    public void punchIn() {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        int minute = now.getMinute();
        double time = hour + (minute / 60);

        lastPunchInTime = time;
    }

    public void punchOut() {
        LocalDateTime now = LocalDateTime.now();
        double hour = now.getHour() + (now.getMinute() / 60.0);
        double time = hour - lastPunchInTime;
        hoursWorked += time;
        lastPunchInTime = 0;
    }


}
