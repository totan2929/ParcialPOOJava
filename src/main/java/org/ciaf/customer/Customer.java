package org.ciaf.customer;

import org.ciaf.booking.Booking;
import org.ciaf.vehicle.Vehicle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int idCustomer;
    private String nameCustomer;
    public List<Booking> bookings;

    public Customer(int idCustomer, String nameCustomer, List<Booking> bookings) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.bookings = new ArrayList<>();
    }

    public Customer(int idCustomer, String nameCustomer) {
        this.idCustomer = idCustomer;
        this.nameCustomer = nameCustomer;
        this.bookings = new ArrayList<>();
    }


    public void reserveVehicle(Vehicle vehicle, LocalDate startDate, LocalDate endDate, boolean insurance, boolean gps){

    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
}
