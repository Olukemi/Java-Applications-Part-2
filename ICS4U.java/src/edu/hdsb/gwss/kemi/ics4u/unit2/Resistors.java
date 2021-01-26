/*
 * Name: Kemi
 * Date: March 2nd 2020
 * Version: v.v1
 * Description: This program takes three colours, seperated by hyphens, and prints
the value of the resistor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 4UKemi
 */
public class Resistors {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        Scanner input = new Scanner(System.in);
        StringTokenizer st;

        //VARIABLES
        double value;
        int x = 0;
        int y = 0;
        int z = 0;
        String colour;
        String colours;
        String data[] = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};

        //SPLASH PAGE
        System.out.println("What is your resistors colour code?");
        System.out.println("Seperate each colour by hyphens");
        System.out.println("Ex: Red-Orange-Black");

        //INPUT
        colours = input.nextLine();
        st = new StringTokenizer(colours, "-");

        //PROCESSING
        colour = st.nextToken();
        for (int i = 0; i < data.length; i++) {
            if (colour.equalsIgnoreCase(data[i])) {
                x = i;
            }
        }
        colour = st.nextToken();
        for (int i = 0; i < data.length; i++) {
            if (colour.equalsIgnoreCase(data[i])) {
                y = i;
            }
        }
        colour = st.nextToken();
        for (int i = 0; i < data.length; i++) {
            if (colour.equalsIgnoreCase(data[i])) {
                z = i;
            }
        }

        value = ((x * 10) + y) * Math.pow(10, z);

        //OUTPUT
        System.out.println("You entered " + colours);
        System.out.println("The value of the resistor is " + value + " ohms");

    }

}
