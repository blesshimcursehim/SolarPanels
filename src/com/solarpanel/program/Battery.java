package com.solarpanel.program;

public class Battery {
    private String size;
    private double capacity; // in kWh
    private double cost;

    public Battery(String size, double capacity, double cost) {
        this.size = size;
        this.capacity = capacity;
        this.cost = cost;
    }

    public String getSize() {
        return size;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return size + " Battery: " + capacity + " kWh, $" + cost;
    }
}
