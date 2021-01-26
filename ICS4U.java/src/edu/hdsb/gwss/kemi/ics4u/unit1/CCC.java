/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author kemij
 */
public class CCC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Problem 1
        Scanner input = new Scanner(System.in);

        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int tempa = 0;
        int tempb = 0;
        int tempc = 0;
        int tempd = 0;

        System.out.print(a);
        System.out.println(b);
        System.out.print(c);
        System.out.println(d);

        System.out.println("Enter a sequence of H and V:");
        String flip = input.nextLine();
        for (int i = 0; i < flip.length(); i++) {
            if (flip.charAt(i) == 'H') {
                tempa = a;
                tempb = b;
                a = c;
                b = d;
                c = tempa;
                d = tempb;
            }
            if (flip.charAt(i) == 'V') {
                tempa = a;
                tempc = c;
                a = b;
                c = d; 
                b = tempa;
                d = tempc;
            }

        }
        
        System.out.print(a);
        System.out.println(b);
        System.out.print(c);
        System.out.println(d);
        
        //Problem 2
        
        System.out.println();
    }
}
