package org.ciaf.vehicle;

public class Car extends Vehicle {
    private String typeFuel;

    public Car(int idVehicle, String brand, String model, int yearVehicle, double dailyCost, boolean availability, String typeFuel) {
        super(idVehicle, brand, model, yearVehicle, dailyCost, availability);
        this.typeFuel = typeFuel;
    }

    public String getTypeFuel() {
        return typeFuel;
    }
}
