/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class Vehicle {

    private String number;
    private String numberOfPassengers;
    private String availableSeats;

    public Vehicle(String number, String numberOfPassengers, String availableSeats) {
        this.number = number;
        this.numberOfPassengers = numberOfPassengers;
        this.availableSeats = availableSeats;
    }

    Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(String numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(String availableSeats) {
        this.availableSeats = availableSeats;
    }


}
