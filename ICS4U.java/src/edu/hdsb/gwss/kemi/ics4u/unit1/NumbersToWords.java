/*
 * Name: Kemi
 * Date: May 9th 2019.
 * Version: v0.01
 * Description: This program that converts any number from 10 to 99 from its digit representation to its word representation. 
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.util.Scanner;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class NumbersToWords {

    /**
     * @param args the command line arguments
     */
    //This asks for user number input between 10 and 99.
    public static void inputNum() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 10 and 99:");
        num = input.nextInt();
    }

    // Accounts for any number that is divisable by 10.
    public static void tens() {
        int x = num / 10;
        switch (x) {
            case 1:
                System.out.print("TEN");
                break;
            case 2:
                System.out.print("TWENTY ");
                break;
            case 3:
                System.out.print("THIRTY ");
                break;
            case 4:
                System.out.print("FORTY ");
                break;
            case 5:
                System.out.print("FIFTY ");
                break;
            case 6:
                System.out.print("SIXTY ");
                break;
            case 7:
                System.out.print("SEVENTY ");
                break;
            case 8:
                System.out.print("EIGHTY ");
                break;
            case 9:
                System.out.print("NINETY ");
                break;
        }
    }

    //Accounts for any number that is between 1 and 9
    public static void ones() {
        int x = num % 10;
        switch (x) {
            case 1:
                System.out.print("ONE");
                break;
            case 2:
                System.out.print("TWO");
                break;
            case 3:
                System.out.print("THREE");
                break;
            case 4:
                System.out.print("FOUR");
                break;
            case 5:
                System.out.print("FIVE");
                break;
            case 6:
                System.out.print("SIX");
                break;
            case 7:
                System.out.print("SEVEN");
                break;
            case 8:
                System.out.print("EIGHT");
                break;
            case 9:
                System.out.print("NINE");
                break;
        }

    }

    // Accounts for numbers between 11 and 19(more specifically 11, 12, 13, 15).
    public static void teens() {
        int x = num % 10;
        switch (x) {
            case 1:
                System.out.println("ELEVEN");
                break;
            case 2:
                System.out.println("TWELVE");
                break;
            case 3:
                System.out.println("THIRTEEN");
                break;
            case 5:
                System.out.println("FIFTEEN");
                break;
            default:
                System.out.print("TEEN");
        }

    }
    // Global variable can be used anywhere in the entire code
    public static int num;

    // Depending on the type of numeber, they use different method(s) to make a specific number in its relation to the number 10.
    // Also checks for invaild numbers.
    public static void main(String[] args) {
        inputNum();
        if (num >= 10 && num <= 99) {
            if (num % 10 == 0) {
                tens();
            } else if (num > 12 && num <= 19 && num != 13 && num != 15) {
                ones();
                teens();
            } else if (num == 11 || num == 12 || num == 13 || num == 15) {
                teens();
            } else {
                tens();
                ones();
            }
        } else if (num < 10 || num > 99) {
            System.out.println("INVAILD NUMBER");
        }

    }

}
