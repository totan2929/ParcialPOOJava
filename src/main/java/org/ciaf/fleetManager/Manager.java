package org.ciaf.fleetManager;

import org.ciaf.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Vehicle> fleet;

    public Manager(List<Vehicle> fleet) {
        this.fleet = new ArrayList<>();
    }

    public Manager() {
        this.fleet = new ArrayList<>();
    }



    public boolean checkAvailability(Vehicle vehicle, LocalDate startDate, LocalDate endDate){
        if (vehicle.isAvailability() ){
            System.out.println("Vehicle available");
        }
        return vehicle.isAvailability();
    }

    public List<Vehicle> listAvailablesVehicles() {
        List<Vehicle> availables = new ArrayList<>();
        for(Vehicle vehicle : fleet){
            if (vehicle.isAvailability()){
                availables.add(vehicle);
            }
        }
        return availables;
    }

    public  void addVehicle(Vehicle vehicle){
        fleet.add(vehicle);
    }

    public List<Vehicle> getFleet() {
        return fleet;
    }
}
