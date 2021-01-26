/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.StringTokenizer;

/**
 *
 * @author ww
 */
public class TypeConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        //VARIABLES & CONSTANTS
        //SPLASH PAGE
        //INPUT
        //PROCESSING
        //OUTPUT
        
        //boolean to int
        //boolean to long
        //boolean to double
        //boolean to String
        //char to boolean
        //char to int
        char letter = 'A';
        int number = (int)'b';
        System.out.println(letter);
        System.out.println(number);
        //char to long
        //char to double
        //char to String
        
        //int to boolean
        //int to char
        //int to long
        int x = 3;
        long k = (long)x;
        System.out.println(k);
        //int to double
        int y = 3;
        double j = (double)y;
        System.out.println(j);
        //int to String
        
        //long to boolean
        //long to char
        //long to int
        long i = 3;
        int l = (int)i;
        System.out.println(l);
        //long to double
        //long to String

        //double to boolean
        //double to char
        //double to int
        double a = 3;
        int b = (int)a;
        System.out.println(b);
        //double to long
        //double to String
        
        //String to boolean
        //String to char
        //String to int
        //String to long
        //String to double
        
        //string tokenizer
        String phrase = "First,Last,Phone,Grade 12,username";
        //Objects
        //StringTokenizer st = new StringTokenizer( phrase, "," );
        //System.out.println(st.countTokens());
        //System.out.println(st.nextToken());
        
        String phraseone = "First, Last, Phone, Grade 12, username";
        //Objects
        StringTokenizer st = new StringTokenizer( phraseone, ",", true );
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }

        
        
    }
    
}
