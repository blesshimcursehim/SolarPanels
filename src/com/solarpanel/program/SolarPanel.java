package com.solarpanel.program;

public class SolarPanel {
    private String size;
    private double powerOutput; // in kWh per day
    private double cost;

    public SolarPanel(String size, double powerOutput, double cost) {
        this.size = size;
        this.powerOutput = powerOutput;
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public double getPowerOutput() {
        return powerOutput;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return size + " Solar Panel: " + powerOutput + " kWh/day, $" + cost;
    }
}