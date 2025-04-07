package com.solarpanel.program;

import java.util.Scanner;

public class Configurator {
    private Scanner scanner = new Scanner(System.in);

    public void run() {
        boolean running = true;

        while (running) {
            System.out.println("\nWelcome to the Solar Panel Configurator!");
            System.out.println("Choose your solar panel size:");
            System.out.println("1. Small");
            System.out.println("2. Medium");
            System.out.println("3. Large");

            int panelChoice = scanner.nextInt();
            SolarPanel panel = getPanelByChoice(panelChoice);

            System.out.println("How many panels?");
            int quantity = scanner.nextInt();

            System.out.println("Choose your battery size:");
            System.out.println("1. Small");
            System.out.println("2. Large");

            int batteryChoice = scanner.nextInt();
            Battery battery = getBatteryByChoice(batteryChoice);

            double totalPower = PowerCalculator.calculateTotalPower(panel, quantity);
            double totalCost = CostCalculator.calculateTotalCost(panel, quantity, battery);

            System.out.println("\nYour Configuration:");
            System.out.println(panel);
            System.out.println("Quantity: " + quantity);
            System.out.println(battery);
            System.out.printf("Total Power: %.2f kWh/day\n", totalPower);
            System.out.printf("Total Cost: $%.2f\n", totalCost);

            System.out.println("\nWould you like to try another configuration? (y/n)");
            String again = scanner.next();
            running = again.equalsIgnoreCase("y");
        }

        System.out.println("Thank you for using the configurator!");
    }

    private SolarPanel getPanelByChoice(int choice) {
        switch (choice) {
            case 1:
                return new SolarPanel("Small", 1.5, 200);
            case 2:
                return new SolarPanel("Medium", 3.0, 350);
            case 3:
                return new SolarPanel("Large", 5.0, 500);
            default:
                System.out.println("Invalid choice. Defaulting to Small.");
                return new SolarPanel("Small", 1.5, 200);
        }
    }

    private Battery getBatteryByChoice(int choice) {
        switch (choice) {
            case 1:
                return new Battery("Small", 5, 1000);
            case 2:
                return new Battery("Large", 10, 1800);
            default:
                System.out.println("Invalid choice. Defaulting to Small.");
                return new Battery("Small", 5, 1000);
        }
    }
}
