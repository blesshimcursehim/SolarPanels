package com.solarpanel.program;
//Represents a battery with size, storage capacity, and cost
public class Battery {
    private String size;		//Size label of the battery
    private double capacity; 	//Capacity in kWh
    private double cost;		//Cost of one battery

    //Constructor
    public Battery(String size, double capacity, double cost) {
        this.size = size;
        this.capacity = capacity;
        this.cost = cost;
    }
    //Getters
    public String getSize() {
        return size;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCost() {
        return cost;
    }
    //Returns a formatted string for display of battery info
    @Override
    public String toString() {
        return size + " Battery: " + capacity + " kWh, $" + cost;
    }
}
