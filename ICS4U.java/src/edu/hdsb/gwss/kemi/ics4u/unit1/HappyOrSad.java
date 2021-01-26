/*
 * Name: Kemi
 * Date: Feb. 9th 2020
 * Version: v0.01
 * Description: This program determines the overall mood of a message. 
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class HappyOrSad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECT
        Scanner input = new Scanner(System.in);
        //VARIABLES & CONSTANTS
        String message;
        int happyCount = 0;
        int sadCount = 0;
        
        //INPUT
        message = input.nextLine();
        //PROCESSING
        
        //OUTPUT
        if (happyCount > sadCount){
            System.out.println("happy");
        } else if (sadCount> happyCount){
            System.out.println("sad");
        } else{
            System.out.println("none");
        }
    }

}
