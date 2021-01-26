/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author ww
 */
public class EasterComes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS:
        Scanner input = new Scanner(System.in);
        //month = Interger.parseInt(input.nextLine());
        
        //VARIABLES & CONSTANTS:
        int year, month, day, a, b, c, d, e, f, g, h, i, j, k, m, p;
        
        //INPUT:
        System.out.println("Enter a year:");
        year = input.nextInt();
        
        //PROCESSING:
        // STEP 1 
        a = year % 19;
        // STEP 2
        b = year / 100;
        c = year % 100;
        // STEP 3
        d = b / 4;
        e = b % 4;
        // STEP 4
        f = (b + 8) / 25;
        // STEP 5
        g = (b - f + 1) / 3;
        // STEP 6
        h = ((19 * a) + b - d - g + 15) % 30;
        // STEP 7
        i = c / 4;
        k = c % 4;
        // STEP 8
        j = (32 + (2 * e) + (2 * i) - h - k) % 7;
        // STEP 9
        m = (a + (11 * h) + (22 * j)) / 451;
        // STEP 10
        month = (h + j - (7 * m) + 114) / 31;
        p = (h + j - (7 * m) + 114) % 31;
        // STEP 11
        day = p + 1;
        
        //OUTPUT
        System.out.println("Easter is on day " + day + " of the month " + month);
        
    }

}
