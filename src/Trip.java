/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class Trip {

    private String to;
    private String from;
    private String typeOfVehicle;
    private String price;
    private String distance;
    private String numberOfStops;
    private String DateOfDeparture;
    private String DateOfArrival;

    public Trip(String to, String from, String typeOfVehicle, String price, String distance, String numberOfStops, String DateOfDeparture, String DateOfArrival) {
        this.to = to;
        this.from = from;
        this.typeOfVehicle = typeOfVehicle;
        this.price = price;
        this.distance = distance;
        this.numberOfStops = numberOfStops;
        this.DateOfDeparture = DateOfDeparture;
        this.DateOfArrival = DateOfArrival;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTypeOfVehicle() {
        return typeOfVehicle;
    }

    public void setTypeOfVehicle(String typeOfVehicle) {
        this.typeOfVehicle = typeOfVehicle;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    public String getNumberOfStops() {
        return numberOfStops;
    }

    public void setNumberOfStops(String numberOfStops) {
        this.numberOfStops = numberOfStops;
    }

    public String getDateOfDeparture() {
        return DateOfDeparture;
    }

    public void setDateOfDeparture(String DateOfDeparture) {
        this.DateOfDeparture = DateOfDeparture;
    }

    public String getDateOfArrival() {
        return DateOfArrival;
    }

    public void setDateOfArrival(String DateOfArrival) {
        this.DateOfArrival = DateOfArrival;
    }



    Trip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        Double CalculatePrice() {
        Double result, rateperkm;
        rateperkm = 0.2;
        result = Double.parseDouble(this.getDistance()) * rateperkm;
        return result;
    }
        
}
