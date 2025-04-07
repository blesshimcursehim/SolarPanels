package com.solarpanel.program;
//Handles calculation of total power output based on panel type and quantity 
public class PowerCalculator {
	//Returns total daily power based on panel output and how many that are used
    public static double calculateTotalPower(SolarPanel panel, int quantity) {
        return panel.getPowerOutput() * quantity;
    }
}