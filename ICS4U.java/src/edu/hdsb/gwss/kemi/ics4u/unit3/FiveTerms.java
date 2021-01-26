/*
 * Name: Kemi
 * Date: April 7th 2020
 * Version: v0.01
 * Description: This program determines the nth term of the sequences
 */
package edu.hdsb.gwss.kemi.ics4u.unit3;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class FiveTerms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS:
        //Scanner is used to receive input from the user
        Scanner input = new Scanner(System.in);
        //VARIABLES:
        int n = 0;
        int s;
        //INPUT: Asks the user for which sequence they would like to find the nth term for and then asks for nth term 
        System.out.print("Choose a sequence (1 or 2): ");
        s = input.nextInt();
        if (s == 1) {
            System.out.print("Enter a number: ");
            n = input.nextInt();
        }

        //OUTPUT: Prints out the value of the nth term of either sequence 1 or 2
        if (n >= 1 && s == 1) {
            System.out.println(sequence1(n));
        } else if (s == 2) {
            System.out.println(sequence2(1));
            System.out.println(sequence2(2));
            System.out.println(sequence2(3));
            System.out.println(sequence2(4));
            System.out.println(sequence2(5));
        } else {
            System.out.println("Invaild number");
        }
    }

    //SEQUENCE 1
    public static int sequence1(int n) {
        //CONSTANTS: These are set values for t1 and t2, the first 2 given values of this sequence
        final int tOne = 1;
        final int tTwo = 3;

        //VARIABLES:
        int tn = 0;
        int tN = tOne;
        int tNN = tTwo;

        //PROCESSING: This calculates the value for the nth term based on the arithmetic equation
        if (n == 1){
            tn = tN;
        } else if (n == 2){
            tn = tNN;
        } else if (n > 2){
            tn = sequence1(n - 1) + sequence1(n - 2);
        }
        
        //Returns the value for the nth term
        return tn;
    }

    //SEQUENCE 2
    public static double sequence2(int n) {
        //CONSTANTS: This is a constant value for the first term in this sequence
        final double tOne = 2.00;

        //VARIABLES:
        double tn = 0;
        double tN = tOne;

        //PROCESSING: This calculates the value for the nth term based on the arithmetic equation
        if (n > 1) {
            tn = (double) Math.sqrt((3 * sequence2(n - 1)) + 4);
            tn = Math.round(tn * 100.0) / 100.0; 
        } else {
            tn = (double) tOne;
        }
        //Returns the value for the nth term
        return tn;
    }
}
