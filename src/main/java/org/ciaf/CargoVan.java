package org.ciaf;

public class CargoVan extends Vehicle {
    private double capacityLoad;

    public CargoVan(int idVehicle, String brand, String model, int yearVehicle, double dailyCost, boolean availability, double capacityLoad) {
        super(idVehicle, brand, model, yearVehicle, dailyCost, availability);
        this.capacityLoad = capacityLoad;
    }

    public double getCapacityLoad() {
        return capacityLoad;
    }
}
