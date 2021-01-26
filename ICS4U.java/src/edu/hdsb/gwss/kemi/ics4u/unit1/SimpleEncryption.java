/*
 * Name: Kemi
 * Date: Feb, 9th 2020
 * Version: v0.01
 * Description: This program will encrypt a plaintext message using the 
simple encryption algorithm to create the ciphertext. It allows the user to enter 
the rotation amount that the algorithm moves the letters. The amount is
a value from 1 to 25. The program deciphers a ciphertext 
phrase to its original plaintext message.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author kemij
 */
public class SimpleEncryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        Scanner input = new Scanner(System.in);

        //VARIABLES & CONSTANTS
        String phrase, newPhrase = "";
        int rotation;
        int type;

        //SPLASH PAGE
        System.out.println("This program will...");
        //INPUT
        System.out.println("Enter a phrase:");
        phrase = input.nextLine();
        System.out.println("Enter the rotation amount(1-25):");
        rotation = input.nextInt();
        System.out.println("1 - Encryption");
        System.out.println("2 - Decryption");
        System.out.println("Enter the type of encryption(1 or 2):");
        type = input.nextInt();

        //PROCESSING
        char c = 'A';
        System.out.println((char)((int)c + 3));
        if (type == 1) {
            for (int i = 0; i < phrase.length(); i++) {
                newPhrase = newPhrase + (char)((int)phrase.charAt(i) + rotation);
            }
        } else if (type == 2) {
            for (int i = 0; i < phrase.length(); i++) {
                newPhrase = newPhrase + (char)((int)phrase.charAt(i) - rotation);
            }
        }

        //OUTPUT
        System.out.println("The original phrase is: " + phrase);
        System.out.println("The encryted phrase is: " + newPhrase);
    }

}
