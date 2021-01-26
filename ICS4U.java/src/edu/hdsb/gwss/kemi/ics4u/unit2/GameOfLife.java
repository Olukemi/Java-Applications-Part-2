/*
 * Name: Kemi
 * Date: Feb 25th 2020
 * Version: v0.01
 * Description: 
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

/**
 *
 * @author 4UKemi
 */
public class GameOfLife {

    //CONSTANTS
    static final int CELL_STATE_EMPTY = 0;
    static final int CELL_STATE_ALIVE = 1;
    static final int CELL_STATE_DEAD = 2;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //VARIABLES
        int grid[][] = {
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0}};
        int gridAfter[][] = {
            {0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0},
            {1, 2, 1, 0, 1},
            {0, 1, 1, 1, 0},
            {1, 0, 2, 1, 0}};

        int r, c;
        r = 3;
        c = 2;
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.println(countAliveNeighbours(gridAfter, r, c));
                System.out.println(countDeadNeighbours(gridAfter, r, c));
            }
            System.out.println("");
        }

        //METHODS
        display(grid);
        //placeRandomCells(grid, 20);
        display(gridAfter);
        //PROCESSING
    }

    public static int countAliveNeighbours(int grid[][], int r, int c) {
        int counterAlive = 0;
        for (int rowOfset = -1; rowOfset <= 1; rowOfset++) {
            for (int colOfset = -1; colOfset <= 1; colOfset++) {
                if (grid[r + rowOfset][c + colOfset] == CELL_STATE_ALIVE) {
                    counterAlive++;
                }
            }
        }
        if (grid[r][c] == CELL_STATE_ALIVE) {
            counterAlive--;
        }
        return counterAlive;
    }

    public static int countDeadNeighbours(int grid[][], int r, int c) {
        int counterDead = 0;
        for (int rowOfset = -1; rowOfset <= 1; rowOfset++) {
            for (int colOfset = -1; colOfset <= 1; colOfset++) {
                if (grid[r + rowOfset][c + colOfset] == CELL_STATE_DEAD) {
                    counterDead++;
                }
            }
        }
        if (grid[r][c] == CELL_STATE_DEAD) {
            counterDead--;
        }
        return counterDead;
    }

    public static void placeRandomCells(int grid[][], int numOfCells) {
        int cellsPlaced = 0;
        int row, col;
        do {
            row = (int) (Math.random() * grid.length);
            col = (int) (Math.random() * grid[0].length);
            if (grid[row][col] == CELL_STATE_EMPTY) {
                grid[row][col] = CELL_STATE_ALIVE;
                cellsPlaced++;
            }
        } while (cellsPlaced < numOfCells);
    }

    //DISPLAY
    public static void display(int grid[][]) {
        for (int row = 0; row < grid.length; row++) {
            for (int col = 0; col < grid[row].length; col++) {
                System.out.print(" " + grid[row][col]);
            }
            System.out.println("");
        }
        System.out.println("---------------------------");
    }

}
