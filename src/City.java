/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ahate
 */
public class City {
    private double latitude;
    private double logitude;

    public City(double latitude, double logitude) {
        this.latitude = latitude;
        this.logitude = logitude;
    }

    public City() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLogitude() {
        return logitude;
    }

    public void setLogitude(double logitude) {
        this.logitude = logitude;
    }
    City Alexandria = new City(31.2001,29.9187);
    City Cairo = new City(30.0444,31.2357);
    City Giza = new City(30.0131,31.2089);
    City Paris = new City(48.8566,2.3522);
    City Moscow = new City (55.7558,37.6173);
    City Barcelona = new City (41.3851,2.1734);
}
