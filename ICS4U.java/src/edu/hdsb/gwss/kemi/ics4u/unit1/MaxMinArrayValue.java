/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

/**
 *
 * @author kemij
 */
public class MaxMinArrayValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[][] data = {
            {2, 3, 9, 5},
            {7, -3, 5},
            {-1, 5, 12, 13, 14},
            {1, 0, 0, 15}
        };
        for (int r = 0; r < data.length; r++) {
            System.out.print("MAX:");
            int max = data[r][0];
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] > max) {
                    max = data[r][c];
                }
            }
            System.out.println(max);
            System.out.print("MIN:");
            int min = data[r][0];
            for (int c = 0; c < data[r].length; c++) {
                if (data[r][c] < min) {
                    min = data[r][c];
                }
            }
            System.out.println(min);
        }
    }

}

//    public static int maxValue(int data[][]) {
//        int max = data[][];
//            for (int i = 1; i < data[r].length; i++, r++) {
//                if (data[r][i] > max) {
//                    max = data[r][i];
//                }
//            }
//        return max;
//    }
//    public static int minValue(int data[][]) {
//        int min = data[][0];
//        for (int i = 1; i < data[0].length; i--) {
//            if (data[][i] < min) {
//                min = data[][i];
//            }
//        }
//        return min;

