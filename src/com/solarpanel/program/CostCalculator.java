package com.solarpanel.program;

public class CostCalculator {
    public static double calculateTotalCost(SolarPanel panel, int quantity, Battery battery) {
        return (panel.getCost() * quantity) + battery.getCost();
    }
}
