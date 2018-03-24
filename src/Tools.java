
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ahate
 */
public abstract class Tools {

    /**
     *
     * @param file
     * @param key
     * @return
     */
    public static int Search(File file, String key) {
        int lineNumber = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lineNumber++;
                String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(key)) // found the key in file
                {
                    break;
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tools.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lineNumber;
    }

    public static void GetDrivers(List<Driver> list) throws FileNotFoundException, IOException {
        File file = new File("Drivers.txt");
        Scanner in = new Scanner(file);
        String str;

        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts =str.split(",");
            Driver a =new Driver();
            a.setName(parts[0]);
            a.setID(parts[1]);
            a.setSalary(parts[2]);
            list.add(a);
        }
    }



    public static void GetVehicles(List<Vehicle> list) throws FileNotFoundException, IOException {
        File file = new File("Vehicles.txt");
        Scanner in = new Scanner(file);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts =str.split(",");
            Vehicle a =new Vehicle();
            a.setNumber(parts[0]);
            a.setNumberOfPassengers(parts[1]);
            a.setAvailableSeats(parts[2]);
            list.add(a);
        }
    }


    public static void GetVip(List<Passenger> list) throws FileNotFoundException, IOException {
        File file = new File("Vip.txt");
        Scanner in = new Scanner(file);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts =str.split(",");
            VipPassenger a = new VipPassenger();
            a.setSeat(parts[0]);
            a.setID(parts[1]);
            a.setPassword(parts[2]);
            list.add(a);
        }
    }

    public static void GetTrips(List<Trip> list) throws FileNotFoundException, IOException {
        File file = new File("Trips.txt");
        Scanner in = new Scanner(file);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts =str.split(",");
            Trip a = new Trip();
            a.setTo(parts[0]);
            a.setFrom(parts[1]);
            a.setPrice(parts[2]);
            a.setDistance(parts[3]);
            a.setNumberOfStops(parts[4]);
            list.add(a);
        }
    }
    	public static double GetDistance(City from,City to) {
		double theta = from.getLogitude() - to.getLogitude();
		double dist = Math.sin(degtorad(from.getLatitude())) * Math.sin(degtorad(to.getLatitude())) + Math.cos(degtorad(from.getLatitude())) * Math.cos(degtorad(to.getLatitude())) * Math.cos(degtorad(theta));
		dist = Math.acos(dist);
		dist = radtodeg(dist);
		dist = dist * 60 * 1.1515;
		return (dist);
        }


	public static double degtorad(double deg) {
		return (deg * Math.PI / 180.0);
	}


	public static double radtodeg(double rad) {
		return (rad * 180 / Math.PI);
	}
}