/*
 * Name: Kemi
 * Date: Feb 24th 2020
 * Version: v.v1
 * Description:
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

/**
 *
 * @author 4UKemi
 */
public class Eratosthenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //OBJECTS
        boolean data[] = new boolean[21];
        int numbers[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        display(numbers);

        for (int i = 0; i < 21; i++) {
            if (i % 2 == 0 && i != 2) {
                data[i] = false;
            } else if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0|| i % 11 == 0) {
                data[i] = true;
            }
            if (i % 3 == 0 && i != 3) {
                data[i] = false;
            }

        }
        for (int i = 0; i < numbers.length; i++) {
            if (data[i] == true) {
                System.out.print(numbers[i] + " ");
            }
        }

        //OUTPUT
//        System.out.println("The prime numbers from 1-1000 are:");
//        System.out.println(numbers);
    }

    public static void display(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " " );
        }
        System.out.println("");
    }

}
