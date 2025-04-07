package com.solarpanel.program;
//Handles calculation of cost, based on panel quantity and battery type
public class CostCalculator {
	//Returns the sum of all panel costs and cost of selected battery
    public static double calculateTotalCost(SolarPanel panel, int quantity, Battery battery) {
        return (panel.getCost() * quantity) + battery.getCost();
    }
}
