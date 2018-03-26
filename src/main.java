import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static java.nio.file.Files.list;
import java.util.Arrays;
import static java.util.Collections.list;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
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
public class main {
         static List<Driver> Drivers = new ArrayList<>();
         static List<Trip> Trips = new ArrayList<>();
         static List<Ticket> Tickets = new ArrayList<>();
         static List<Vehicle> Vehicles = new ArrayList<>();
         static List<Vip> Vips = new ArrayList<>();
         public static Double Rate = 1.0;
         public static Double VipRate = 1.0;
    /**
     * @param args the command line arguments
     */
public static void main(String[] args) throws IOException 
    {

     Tools.GetDrivers(Drivers);
     Driver d = new Driver("800","oma7","1");
     Drivers.add(d);
     Tools.WriteDrivers(Drivers);
     
     
    }

 

}
