package org.ciaf.vehicle;

public class Bus extends Vehicle {
    private int capacityPassenger;

    public Bus(int idVehicle, String brand, String model, int yearVehicle, double dailyCost, boolean availability, int capacityPassenger) {
        super(idVehicle, brand, model, yearVehicle, dailyCost, availability);
        this.capacityPassenger = capacityPassenger;
    }


}
