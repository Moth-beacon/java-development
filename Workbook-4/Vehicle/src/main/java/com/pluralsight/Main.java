package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car sedan = new Car();
        sedan.setColor("Blue");
        sedan.setNumberOfPassengers(4);

        SemiTruck hauler = new SemiTruck();
        hauler.setCargoCapacity(2000);
        hauler.setFuelCapacity(150);

        Hovercraft hover = new Hovercraft();
        hover.setColor("Silver");
        hover.setFuelCapacity(80);

        System.out.println("SlowRide (Moped): " + slowRide.getColor() + ", Fuel: " + slowRide.getFuelCapacity());
        System.out.println("Sedan (Car): " + sedan.getColor() + ", Passengers: " + sedan.getNumberOfPassengers());
        System.out.println("Hauler (SemiTruck): Cargo: " + hauler.getCargoCapacity() + ", Fuel: " + hauler.getFuelCapacity());
        System.out.println("Hovercraft: " + hover.getColor() + ", Fuel: " + hover.getFuelCapacity());
    }
}
