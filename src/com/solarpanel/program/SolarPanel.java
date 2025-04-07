package com.solarpanel.program;
//Represents a solar panel with size, power output, and cost
public class SolarPanel {
    private String size; 			//Size of solar panel
    private double powerOutput; 	// in kWh per day
    private double cost;			//Cost of one panel

    //Constructor
    public SolarPanel(String size, double powerOutput, double cost) {
        this.size = size;
        this.powerOutput = powerOutput;
        this.cost = cost;
    }
    //Getters
    public String getSize() {
        return size;
    }

    public double getPowerOutput() {
        return powerOutput;
    }

    public double getCost() {
        return cost;
    }
    //Returns a formatted string for displaying panel info
    @Override
    public String toString() {
        return size + " Solar Panel: " + powerOutput + " kWh/day, $" + cost;
    }
}