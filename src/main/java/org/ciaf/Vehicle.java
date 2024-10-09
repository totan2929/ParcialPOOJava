package org.ciaf;

abstract class Vehicle {
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

    public boolean isAvailability() {
        return availability;
    }
}
