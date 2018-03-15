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
    private Double price;
    private Double distance;
    private int numberOfStops;

    public Trip(String to, String from, String typeOfVehicle, Double price, Double distance, int numberOfStops) {
        this.to = to;
        this.from = from;
        this.typeOfVehicle = typeOfVehicle;
        this.price = price;
        this.distance = distance;
        this.numberOfStops = numberOfStops;
    }

}
