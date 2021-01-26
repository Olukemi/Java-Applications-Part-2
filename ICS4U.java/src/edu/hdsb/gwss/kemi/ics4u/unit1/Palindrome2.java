/*
 * Name: Kemi
 * Date: Feb 8th 2020
 * Version: v0.01
 * Description: Make changes to Palindrome.java such that the program will allow
the user to enter a sentence and then count the number of words in the sentence 
that are palindromes. 
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class Palindrome2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES & CONSTANTS
        String phrase, word, newWord;
        int pwordcount = 0;
        //OBJECTS
        Scanner input = new Scanner(System.in);
        //SPLASH PAGE
        System.out.println("Words that are the same forwards and backwards "
                + " are called palindromes. This program determines"
                + " if the words are palindrome.");
        //INPUT
        System.out.println("Enter a phrase:");
        phrase = input.nextLine();
        
        //PROCESSING
        StringTokenizer st = new StringTokenizer(phrase);
        while (st.hasMoreTokens()) {
            word = st.nextToken();
            newWord = "";
            for (int i = 0; i < word.length(); i++) {
                newWord = word.charAt(i) + newWord;
                if (newWord.equalsIgnoreCase(word)) {
                    pwordcount++;
                }
            }
        }

        //OUTPUT       
        if (pwordcount > 0) {
            System.out.println("There are " + pwordcount + " palindromes in this sentence.");
        } else {
            System.out.println("There are no palindromes in this sentence.");
        }
    }

}
