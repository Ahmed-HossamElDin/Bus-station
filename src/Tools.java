
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import javax.swing.JOptionPane;

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
        int flag = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                lineNumber++;
                String lineFromFile = scanner.nextLine();
                if (lineFromFile.contains(key)) // found the key in file
                { flag  = 1;
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
            String[] parts = str.split("/");
            Driver a = new Driver();
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
            String[] parts = str.split("/");
            Vehicle a = new Vehicle();
            a.setNumber(parts[0]);
            a.setNumberOfPassengers(parts[1]);
            a.setAvailableSeats(parts[2]);
            list.add(a);
        }
    }

    public static void GetVip(List<VipPassenger> list) throws FileNotFoundException, IOException {
        File file = new File("Vip.txt");
        Scanner in = new Scanner(file);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts = str.split("/");
            VipPassenger a = new VipPassenger();
            a.setUsername(parts[1]);
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
            String[] parts = str.split("/");
            Trip a = new Trip();
            a.setTo(parts[0]);
            a.setFrom(parts[1]);
            a.setPrice(parts[2]);
            a.setDistance(parts[3]);
            a.setNumberOfStops(parts[4]);
            a.setDateOfDeparture(parts[5]);
            a.setType(parts[6]);
            a.setTypeOfVehicle(parts[7]);
            list.add(a);
        }
    }
    public static void GetTicket(List<Ticket> list) throws FileNotFoundException, IOException {
        File file = new File("Tickets.txt");
        Scanner in = new Scanner(file);
        String str;
        while (in.hasNext()) {
            str = in.nextLine();
            String[] parts = str.split("/");
            Ticket a = new Ticket();
            a.setTicketNumber(parts[0]);
            a.setPrice(Double.parseDouble(parts[1]));
            a.setTimeOfDeparture(parts[2]);
            a.setDateOfReturn(parts[3]);
            list.add(a);
        }
    }

    public static double GetDistance(City from, City to) {
        double theta = from.Longitude - to.Longitude;
        double dist = Math.sin(degtorad(from.Latitude)) * Math.sin(degtorad(to.Latitude)) + Math.cos(degtorad(from.Latitude)) * Math.cos(degtorad(to.Latitude)) * Math.cos(degtorad(theta));
        dist = Math.acos(dist);
        dist = radtodeg(dist);
        dist = dist * 60 * 1.1515;
        int distance = (int) dist;
        return (distance);
    }

    public static double degtorad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    public static double radtodeg(double rad) {
        return (rad * 180 / Math.PI);
    }

    public static void WriteDrivers(List<Driver> list) {
        try {
            boolean append = false;
            boolean autoFlush = true;
            String charset = "UTF-8";
            String filePath = "Drivers.txt";

            File file = new File(filePath);

            FileOutputStream fos = new FileOutputStream(file, append);
            OutputStreamWriter osw = new OutputStreamWriter(fos, charset);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, autoFlush);
            for (int i = 0; i < list.size(); i++) {
                Driver d = list.get(i);
                String data = d.getID() + '/' + d.getName() + '/' + d.getSalary();
                // System.out.println(data);
                pw.printf(data);
                if (i < list.size() - 1) {
                    bw.newLine();
                }
            }

            pw.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "File not found!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }
    }

    public static void WriteVehicles(List<Vehicle> list) {
        try {
            boolean append = false;
            boolean autoFlush = true;
            String charset = "UTF-8";
            String filePath = "Vehicles.txt";

            File file = new File(filePath);

            FileOutputStream fos = new FileOutputStream(file, append);
            OutputStreamWriter osw = new OutputStreamWriter(fos, charset);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, autoFlush);
            for (int i = 0; i < list.size(); i++) {
                Vehicle d = list.get(i);
                String data = String.valueOf(d.getNumber()) + '/' + d.getNumberOfPassengers() + '/' + d.getAvailableSeats();
                // System.out.println(data);
                pw.printf(data);
                if (i < list.size() - 1) {
                    bw.newLine();
                }
            }

            pw.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "File not found!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    public static void WriteVip(List<VipPassenger> list) {
        try {
            boolean append = false;
            boolean autoFlush = true;
            String charset = "UTF-8";
            String filePath = "Vip.txt";

            File file = new File(filePath);

            FileOutputStream fos = new FileOutputStream(file, append);
            OutputStreamWriter osw = new OutputStreamWriter(fos, charset);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, autoFlush);
            for (int i = 0; i < list.size(); i++) {
                VipPassenger d = list.get(i);
                String data = String.valueOf(d.getUsername() + '/' + d.getPassword());
                // System.out.println(data);
                pw.printf(data);
                if (i < list.size() - 1) {
                    bw.newLine();
                }
            }

            pw.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "File not found!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }

    public static void WriteTrip(List<Trip> list) {
        try {
            boolean append = false;
            boolean autoFlush = true;
            String charset = "UTF-8";
            String filePath = "Trips.txt";

            File file = new File(filePath);

            FileOutputStream fos = new FileOutputStream(file, append);
            OutputStreamWriter osw = new OutputStreamWriter(fos, charset);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, autoFlush);
            for (int i = 0; i < list.size(); i++) {
                Trip d = list.get(i);
                String data = String.valueOf(d.getTo()) + '/' + d.getFrom() + '/' + d.getPrice() + '/' + d.getDistance() + '/' + d.getNumberOfStops() + '/' + d.getDateOfDeparture()+ '/' +d.getType()+ '/' +d.getVehicle();
                // System.out.println(data);
                pw.printf(data);
                if (i < list.size() - 1) {
                    bw.newLine();
            }
                }

            pw.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "File not found!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
    public static void WriteTicket(List<Ticket> list) {
        try {
            boolean append = false;
            boolean autoFlush = true;
            String charset = "UTF-8";
            String filePath = "Tickets.txt";

            File file = new File(filePath);

            FileOutputStream fos = new FileOutputStream(file, append);
            OutputStreamWriter osw = new OutputStreamWriter(fos, charset);
            BufferedWriter bw = new BufferedWriter(osw);
            PrintWriter pw = new PrintWriter(bw, autoFlush);
            for (int i = 0; i < list.size(); i++) {
                Ticket d = list.get(i);
                String data = String.valueOf(d.getTicketNumber()) + '/' + d.getPrice()+ '/' + d.getTimeOfDeparture()+ '/' +d.getDateOfReturn();
                // System.out.println(data);
                pw.printf(data);
                if (i < list.size() - 1) {
                    bw.newLine();
                }
            }

            pw.close();
        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "File not found!", "Warning!", JOptionPane.ERROR_MESSAGE);
            return;
        }

    }
}
