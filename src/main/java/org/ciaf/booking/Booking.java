package org.ciaf.booking;

import org.ciaf.customer.Customer;
import org.ciaf.vehicle.Vehicle;

import java.time.LocalDate;

public class Booking {
    private int idBooking;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate enddate;
    private double totalCost;

    public Booking(int idBooking, Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate enddate, double totalCost) {
        this.idBooking = idBooking;
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.enddate = enddate;
        this.totalCost = totalCost;
    }

    public void confirmReservation(Vehicle vehicle){
        if (vehicle.isAvailability() == true){
            vehicle.setAvailability(false);
        }else {
            System.out.println("We are sorry, the requested vehicle is not available.!!!!!");
        }
    }

    public int getIdBooking() {
        return idBooking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public double getTotalCost() {
        return totalCost;
    }
}
