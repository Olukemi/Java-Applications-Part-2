/*
 * Name: Kemi
 * Date: Feb 7th 2020
 * Version: v0.01
 * Description: Words that are arranged the same way forwards as they are 
backwards are called palindromes. For example, RADAR is a palindrome. 
Create a program that directs the user to enter a word. The program will print 
the word backwards and then inform the user if it is a palindrome or not. 
Treat uppercase letters and lowercase letters as the same, so the program 
should convert the letters to all uppercase or all lowercase. 
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author 4UKemi
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        Scanner input = new Scanner(System.in);
        //VARIABLES & CONSTANTS
        String word, newWord = "";
        //SPLASH PAGE
        System.out.println("Words that are the same forwards and backwards "
                + " are called palindromes. This program determines"
                + " if a words is a palindrome.");
        //INPUT
        System.out.println("Enter a word:");
        word = input.nextLine();
        //PROCESSING
        for (int i = 0; i < word.length(); i++){
            newWord = word.charAt(i) + newWord;
        }     
        
        //OUTPUT
        System.out.println(word + " in reverse is " + newWord);
        
        if (newWord.equalsIgnoreCase(word)){
           System.out.println("This word IS a palindrome."); 
        } else {
           System.out.println("This word IS NOT a palindrome.");
        }
       
    }
    
}
