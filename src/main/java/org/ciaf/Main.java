package org.ciaf;

import org.ciaf.booking.Booking;
import org.ciaf.customer.Customer;
import org.ciaf.fleetManager.Manager;
import org.ciaf.vehicle.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager managerAdmin = new Manager();

        Car car1 = new Car(1, "Toyota", "Corolla", 2022, 200000, true, "Gasolina" );
        Motorbike motorbike1 = new Motorbike(1, "Yamaha", "MT -05", 2020, 150000, true, 650);
        CargoVan cargoVan1 = new CargoVan(1, "Ford", "Ranger", 2021, 135000, true, 2);
        Bus bus1 = new Bus(1, "Mercedes", "Sprinter", 2020, 450000, false, 22);

        managerAdmin.addVehicle(car1);
        managerAdmin.addVehicle(motorbike1);
        managerAdmin.addVehicle(cargoVan1);
        managerAdmin.addVehicle(bus1);

        Customer customer1 = new Customer(1, "Santiago");

        LocalDate startDate = LocalDate.of(2024, 10, 15);
        LocalDate endDate = LocalDate.of(2024, 10, 16);

        Period totalDays = Period.between(startDate,endDate);
        int days = totalDays.getDays();

        try{
            System.out.println("Tle Fleet of Vehicles");
            for(Vehicle vehicle : managerAdmin.getFleet()){
                System.out.println(vehicle.getBrand());
            }

            System.out.println("**************************************");

            if (managerAdmin.checkAvailability(car1)){

                System.out.println("****************************");
                customer1.reserveVehicle(car1, startDate, endDate, true, true);

                Booking booking1 = new Booking(1, customer1, car1, startDate, endDate, car1.calculatePrice(days, true, true));
                booking1.confirmReservation(car1);
                customer1.bookings.add(booking1);
                System.out.println("Reservation made successfully.");
            }else{
                System.out.println("Vehicle is not available");
                System.out.println("******************************");
                System.out.println("Vehicles Availables: ");
                for (Vehicle vehicle : managerAdmin.listAvailablesVehicles()){
                    System.out.println(vehicle.getBrand() + vehicle.getModel());
                }
            }


        }catch (IllegalArgumentException e){
            System.out.println("Error");
        }


    }
}