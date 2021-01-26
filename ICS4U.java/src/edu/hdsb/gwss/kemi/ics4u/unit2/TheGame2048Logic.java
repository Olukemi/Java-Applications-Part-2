/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

/**
 *
 * @author 4UKemi
 */
public class TheGame2048Logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int data[][] = {
            {0, 2, 2, 0},
            {0, 2, 2, 0},
            {0, 2, 2, 0},
            {0, 2, 2, 0}
        };

        shiftLeft(data);
        display(data);
        mergeLeft(data);
        display(data);

    }

    public static void display(int grid[][]) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(" " + grid[row][col]);
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
    }

    public static void shiftLeft(int data[][]) {
        // SHIFT LEFT; EACH ROW
        for (int r = 0; r < data.length; r++) {

            // Worst Case Scenario: N-1 passes needed
            for (int pass = 0; pass < data.length; pass++) {

                // COLUMNS
                for (int c = 0; c < data[r].length - 1 - pass; c++) {
                    if (data[r][c] == 0) {
                        data[r][c] = data[r][c + 1];
                        data[r][c + 1] = 0;
                    }

                } // END; FOR COL

            } // END; FOR PASS

        } // END; FOR ROW
    }

    public static void mergeLeft(int data[][]) {
        // MERGE LEFT; EACH ROW
        int score = 0;
        for (int r = 0; r < data.length; r++) {

            // COLUMNS
            for (int c = 0; c < data[r].length - 1; c++) {
                if (data[r][c] == data[r][c + 1]) {
                    data[r][c] = data[r][c] * 2;
                    data[r][c + 1] = 0;

                    // UPDATE SCORE
                    score += data[r][c];
                    data[r][0] = data[r][c] * 2;
                  
                }
            } // END; FOR COL
            

        } // END; FOR ROW

    }

    

}
