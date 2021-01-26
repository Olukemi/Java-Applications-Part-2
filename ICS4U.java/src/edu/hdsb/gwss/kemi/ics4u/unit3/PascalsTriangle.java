/*
 * Name: Kemi
 * Date: April 7th 2020
 * Version: v0.01
 * Description: This program creates Pascal's Triangle
 */
package edu.hdsb.gwss.kemi.ics4u.unit3;

import java.util.ArrayList;

/**
 *
 * @author kemij
 */
public class PascalsTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Calls the method to display a given row and print a term at a specific row and column in the triangle
        row(7);
        System.out.println(term(4, 2));

    }

    //This method returns the term for the given row & col
    public static int term(int row, int col) {
        //VARIABLES:
        int term = 0;
        
        if (col == 0){// all numbers in column 0 are 1
           term = 1;
        } else if (row == col){ // all numbers at the end of each row are equal to 1
            term = 1;
        } else {
            term = term(row - 1, col - 1) + term(row - 1, col); // all numbers in between are sum of the terms above and above to the left 
        }
        //Returns the term of the given row & col
        return term;
    }
    //This method displays Pascal's Triangle for the given row
    public static int row(int row) {
        //DISPLAY: This displays a row at a time and calls the term funtion to assign each row woth its term values  
        for ( int r = 0; r < row; r++){
            for (int c = 0; c <= r; c++){
                System.out.print( term(r,c) + " ");
            }
            System.out.println(" ");
        }
        
        return row;
    }
}
