package org.ciaf.vehicle;

public abstract class Vehicle {
    protected int idVehicle;
    protected String brand;
    protected String model;
    protected int yearVehicle;
    protected double dailyCost;
    protected boolean availability;

    public Vehicle(int idVehicle, String brand, String model, int yearVehicle, double dailyCost, boolean availability) {
        this.idVehicle = idVehicle;
        this.brand = brand;
        this.model = model;
        this.yearVehicle = yearVehicle;
        this.dailyCost = dailyCost;
        this.availability = availability;
    }

    public double calculatePrice(int days, boolean insurance, boolean gps){

        double totalCost = dailyCost * days;
        double costInsurance = dailyCost * 0.90 * days;
        double costGps = 5 * days;

        if (insurance && gps){
            totalCost += costInsurance + costGps;
        } else if (insurance && !gps) {
            totalCost += costInsurance;
        } else if (!insurance && gps) {
            totalCost += costGps;
        }
        return totalCost;
    }

    public int getIdVehicle() {
        return idVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearVehicle() {
        return yearVehicle;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public boolean isAvailability() {
        return availability;
    }
}
