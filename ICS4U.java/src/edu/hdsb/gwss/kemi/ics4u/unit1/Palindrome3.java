/*
 * Name: Kemi
 * Date: Feb 9th 2020
 * Version: v0.01
 * Description: Make changes to Palindrome.java such that the program will allow
the user to enter a phrase and determine if the phrase is a palindrome. For example, 
the phrases “Race car” and “Able was I ere I saw Elba” are palindromes.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //VARIABLES & CONSTANTS
        String phrase, comPhrase;
        String newPhrase = "";
        //OBJECTS(including Tokenizer)
        Scanner input = new Scanner(System.in);
        //SPLASH PAGE
        System.out.println("Words that are the same forwards and backwards "
                + " are called palindromes. This program determines"
                + " if the words are palindrome.");
        //INPUT
        System.out.println("Enter a phrase:");
        phrase = input.nextLine();
        
        //PROCESSING
        StringTokenizer st = new StringTokenizer(phrase, " ");
        comPhrase = st.nextToken().concat(st.nextToken());
        while (st.hasMoreTokens()){
           comPhrase = comPhrase.concat(st.nextToken()); 
        }
        for (int i = 0; i < comPhrase.length(); i++){
            newPhrase = comPhrase.charAt(i) + newPhrase;
        }    

        //OUTPUT       
        
        if (newPhrase.equalsIgnoreCase(comPhrase)){
           System.out.println(phrase + " IS a palindrome."); 
        } else {
           System.out.println(phrase + " IS NOT a palindrome.");
        }
    }
    
}
