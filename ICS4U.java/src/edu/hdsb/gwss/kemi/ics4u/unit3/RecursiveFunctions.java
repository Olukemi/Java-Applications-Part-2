/*
 * Name: Kemi
 * Date: April 7th 2020
 * Version: v0.01
 * Description: This program evalutes the definition of a function with given parameters
 */
package edu.hdsb.gwss.kemi.ics4u.unit3;

/**
 *
 * @author kemij
 */
public class RecursiveFunctions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //DISPLAY: This displays the values for the given functions when assigned parameter values
        System.out.println("Function 1 Evaluations");
        System.out.println(function1(5, 3));
        System.out.println(function1(2, 2));
        System.out.println(function1(1, 4));
        System.out.println(function1(-5, -2));
        System.out.println("Function 2 Evaluations");
        System.out.println(function2(1, 1));
        System.out.println(function2(2, 5));
        System.out.println(function2(5, 5));

    }

    // FUNCTION 1 : The effect of this function is finding the difference between x and y
    public static int function1(int x, int y) {
        //VARIABLES:
        int value = 0;
        
        //PROCESSING: This function evaluates the x and y parameters in the mathematical algorithm 
        if (x < y) {
            value = function1( y, x);
        } else if (x == y) {
            value = 0;
        } else if (x > y) {
            value = 1 + (function1(x-1, y));
        }
        //Returns the evaluted value of x and y in function 1
        return value;
    }

    //FUNCRION 2: Ackermann's Function
    public static int function2(int m, int n) {
        //VARIABLES:
        int value;
        
        //PROCESSING: This function evaluates the m and n parameters in the mathematical algorithm 
        if (m == 0) {
            value = n + 1;
        } else if (m > 0 && n == 0) {
            value = function2(m - 1, 1);
        } else {
            value = function2(m - 1, function2(m, n - 1));
        }
        //Returns the evaluted value of m and n in function 2
        return value;
    }

}
