/*
 * Name: Kemi
 * Date: May 17th 2019
 * Version: v0.01
 * Description: This program will reduce any fraction into its lowest terms.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    //Prints the reduced fraction in another file by calling a method that does the reduction. 
    public static void main(String[] args) throws FileNotFoundException {
        File inFile = new File("ReduceInput.txt");
        File outFile = new File("ReduceOutput.txt");
        Scanner input = new Scanner(inFile);
        PrintWriter output = new PrintWriter(outFile);
        while (input.hasNext()) {
            String line = input.nextLine();
            output.println(stringToNumbers(line));
        }
        output.close();
    }
    
   

    //This converts the string into an integer from a string from an input file. It also calls on the method below which
    //finds the gcd.
    public static String stringToNumbers(String line) {
        StringTokenizer st = new StringTokenizer(line, "/ ");
        int num = Integer.parseInt(st.nextToken());
        int den = Integer.parseInt(st.nextToken());
        String answer = typeOfFractionCheck(num, den);
        return answer;
    }

    //This method finds the gcd and checks for any special fraction, with signs and placement of those signs, if the fraction
    //is being divided by 0 or if the numerator is 0 and more. It then returns the reduced fraction.
    public static String typeOfFractionCheck(int num, int den) {
        int reduceFrac;
        String reFrac = "";
        if (den == 0) {
            reFrac = "undefined";
        } else if ((num % den) == 0) {
            reduceFrac = num / den;
            reFrac = Integer.toString(reduceFrac);
        } else if (num == 0) {
            reduceFrac = 0;
            reFrac = Integer.toString(reduceFrac);
        } else {
            reFrac = greatestCommonDivisor(num, den);

        }

        return reFrac;
    }

    public static String greatestCommonDivisor(int num, int den) {
        int answerNum, answerDen;
        int gcd = 1;
        String reFrac = "";
        for (int i = 2; i <= Math.abs(Math.min(num, den)); i++) {
            if (num % i == 0 && den % i == 0) {
                gcd = i;
            }
        }
        answerNum = num / gcd;
        answerDen = den / gcd;
        if (answerNum < 0 && answerDen < 0) {
            answerNum = answerNum / -1;
            answerDen = answerDen / -1;
        } else if (answerDen < 0) {
            answerDen = answerDen / -1;
            answerNum = answerNum * -1;
        }
        reFrac = reFrac + Integer.toString(answerNum) + "/" + Integer.toString(answerDen);

        return reFrac;
    }

}
