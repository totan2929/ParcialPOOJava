package org.ciaf.booking;

import org.ciaf.customer.Customer;
import org.ciaf.vehicle.Vehicle;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Booking {
    private int idBooking;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private double totalCost;

    public Booking(int idBooking, Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, double totalCost) {
        this.idBooking = idBooking;
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.totalCost = totalCost;
    }


    public void confirmReservation(Vehicle vehicle){
        Period totalDays = Period.between(startDate,endDate);
        int days = totalDays.getDays();
        int confirm;
        boolean insurance = false;
        boolean gps = false;
        int insurance1;
        int gps1;
        Scanner sc = new Scanner(System.in);
        if (vehicle.isAvailability() == true){
            System.out.println("Do You want to make a reservation:\n" +
                    "Writes\n" +
                    "1. Yes\n" +
                    "2. No");
            confirm = sc.nextInt();
            if (confirm == 1){
                vehicle.setAvailability(false);
                System.out.println("Do You want to include insurance in the reservation:\n" +
                        "Writes\n" +
                        "1. Yes\n" +
                        "2. No");
                insurance1 = sc.nextInt();
                System.out.println("Do You want to include GPS in the reservation:\n" +
                        "Writes\n" +
                        "1. Yes\n" +
                        "2. No");
                gps1 = sc.nextInt();
                if (insurance1 == 1){
                    insurance = true;
                }
                if (gps1 == 1){
                    gps = true;
                }
                totalCost =vehicle.calculatePrice(days, insurance, gps);

                System.out.println("The total cost without insurance and without GPS is: " + "$" +totalCost);
            }

        }else {
            System.out.println("We are sorry, the requested vehicle is not available.!!!!!");
        }
    }

}
