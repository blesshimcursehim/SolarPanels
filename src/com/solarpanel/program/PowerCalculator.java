package com.solarpanel.program;

public class PowerCalculator {
    public static double calculateTotalPower(SolarPanel panel, int quantity) {
        return panel.getPowerOutput() * quantity;
    }
}