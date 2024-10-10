package org.ciaf.vehicle;

public class Motorbike extends Vehicle {
    private double cylinderCapacity;

    public Motorbike(int idVehicle, String brand, String model, int yearVehicle, double dailyCost, boolean availability, double cylinderCapacity) {
        super(idVehicle, brand, model, yearVehicle, dailyCost, availability);
        this.cylinderCapacity = cylinderCapacity;
    }


}
