/*
 * Name: Kemi
 * Date: April 28th 2019
 * Version: v.0.01
 * Decription: This program converts arablish to english by reversing the order of words in a sentences and the letters in a word. 
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import edu.hdsb.gwss.kemi.ics4u.unit1.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class Arablish2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //OBJECTS: These are used to create, read and communicate data through input and output files.
        File outFile = new File("OUT31.txt");
        File inFile = new File("DATA31.txt");
        PrintWriter output = new PrintWriter(outFile);
        Scanner input = new Scanner(inFile);
        String line = input.nextLine();
        reverseWord(line);
        output.close();

    }

    public static boolean isNumeric(String line) {
        StringTokenizer st = new StringTokenizer(line, "  ");
        String word = st.nextToken();
        String reverseWord = "";
        int counter = 0;
        boolean isNumeric = false;
        for (int i = word.length() - 1; counter <= word.length(); i--) {
            if ((word.codePointAt(i) >= 48) && (word.codePointAt(i) <= 57)) {
                counter++;
                isNumeric = true;
            }
            if (isNumeric) {
                reverseWord = word;
            }
        }
        return true;
    }

    //CONSTANTS: N/A
    //VARIABLES: N/A (They are in processing and they cannot move because it ruins the code).
    public static String reverseWord(String line) {
        //PROCESSING && OUTPUT: Reverses the words' order and their letters but keeps the number string as they are.
        StringTokenizer st = new StringTokenizer(line, "  ");
        String reverseLine = "";
        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            String reverseWord = "";
            String reverse = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                isNumeric(word);
                reverse = reverse + word.charAt(i);
                reverseWord = reverse + " ";
                reverseLine = reverseWord + " " + reverseLine;
            }
            //CLOSING FILE: This tells the program that the file is complete and can process any actions.

        }
        return line;
    }

}
