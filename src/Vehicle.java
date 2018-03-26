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
    private Boolean availabe;

    Vehicle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Vehicle(String number, String numberOfPassengers, String availableSeats, Boolean availabe) {
        this.number = number;
        this.numberOfPassengers = numberOfPassengers;
        this.availableSeats = availableSeats;
        this.availabe = availabe;
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

    public Boolean getAvailabe() {
        return availabe;
    }

    public void setAvailabe(Boolean availabe) {
        this.availabe = availabe;
    }

    public Boolean IsFull() {
        if (Double.parseDouble(this.availableSeats) < Double.parseDouble(this.numberOfPassengers)) {
            return false;
        } else {
            return true;
        }
    }
}
