                                                             /*
 * Name:
 * Date:
 * Version:
 * Decription:
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

/**
 *
 * @author 1ODUJINRIKEM
 */
public class BubbleSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numbers[] = {20, 77, 41, 834, 196, 2, 111, 508, 16, 27};
        display(numbers);
        bubbleSort(numbers);
        bubbleSort(numbers);
        display(numbers);
    }

    public static void bubbleSort(int numbers[]) {
        int swaps = 0;
        int comps = 0;
        boolean swapMade = true;
        // MULTIPLE PASSES
        for (int pass = 0; pass < numbers.length && swapMade; pass++) {
            swapMade = false;
            // PASS
            for (int i = 0; i < numbers.length - 1 - pass; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    swap(numbers, i, i + 1);
                    swapMade = true;
                    swaps++;
                }
                comps++;
            }      
        }
        System.out.println("COMPS: " + comps );
        System.out.println("SWAPS: " + swaps );
    }

    public static void swap(int numbers[], int i, int j) {//i = 4, j = 2
        int extraHand = numbers[i];
        numbers[i] = numbers[j];
        numbers[j] = extraHand;

    }

    public static void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println(" ");
    }

}
