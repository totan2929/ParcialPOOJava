package org.ciaf.customer;

import org.ciaf.booking.Booking;
import org.ciaf.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    private List<Booking> bookings;

    public Customer(int idCustomer, String nameCustomer, List<Booking> bookings) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.bookings = new ArrayList<>();
    }

    public void reserveVehicle(Vehicle vehicle, LocalDate startDate, LocalDate endDate, boolean insurance, boolean gps){
        if (vehicle.isAvailability()){
            bookings.add(new Booking(idCustomer));
        }else{
            System.out.println("The vehicle is not available on the selected dates.");
        }
    }
}
