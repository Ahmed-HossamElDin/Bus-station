/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public abstract class Vehicle {

    private int number;
    private int numberOfPassengers;
    private int availableSeats;
    private int bookedSeats;

    public Vehicle(int number, int numberOfPassengers, int availableSeats, int bookedSeats) {
        this.number = number;
        this.numberOfPassengers = numberOfPassengers;
        this.availableSeats = availableSeats;
        this.bookedSeats = bookedSeats;
    }
}
