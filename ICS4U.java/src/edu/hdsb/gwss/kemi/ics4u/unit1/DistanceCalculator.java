/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author ww
 */
public class DistanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS:
        Scanner input = new Scanner (System.in);
  
        //VARIABLES & CONSTANTS:
        double distance;
        
        //SPLASH PAGE:
        System.out.println("When entering latitude and longitude, please "
                + "use degrees. For example: 43 degrees 40 minutes "
                + "would be entered as 43.67. Use positive values for North "
                + "Latitudes. Use negative values for South "
                + "latitudes and East longitude. ");
        //INPUT:
        System.out.println("Place 1:");
        String placeOne = input.nextLine();
        System.out.println("Place 2:");
        String placeTwo = input.nextLine();
        
        System.out.println("----------------------------------");
        
        System.out.println("Latitude of " + placeOne + ":");
        double placeOneLat = input.nextDouble();
        System.out.println("Longitude of " + placeOne + ":");
        double placeOneLon = input.nextDouble();
        
        System.out.println("----------------------------------");
        
        System.out.println("Latitude of " + placeTwo + ":");
        double placeTwoLat = input.nextDouble();
        System.out.println("Longitude of " + placeTwo + ":");
        double placeTwoLon = input.nextDouble();
        
        System.out.println("----------------------------------");
        
        //PROCESSING:
        distance = 6378.8 * Math.acos(Math.sin(placeOneLat/57.2958) * Math.sin(placeTwoLat/57.2958) + Math.cos(placeOneLat/57.2958) * Math.cos(placeTwoLat/57.2958) * Math.cos(placeTwoLon/57.2958 - placeOneLon/57.2958));
        
        //OUTPUT:
        System.out.println("The distance = " + distance + "km as the crow flies");
    }
    
}
