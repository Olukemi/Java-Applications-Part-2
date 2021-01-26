/*
 * Rotten Tomatoes
 * ICS4U.2020.S2
 * Name: Kemi
 * Date: Feb 11th 2020
 * Version: v.0.01
 * Description: This program searches through files containing movie reviews from the Rotten Tomatoes website.
 */
package edu.hdsb.gwss.kemi.ics4u.unit1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author YOU
 */
public class MoviewReview {

    // CLASS CONSTANTS
    private static final String FS = File.separator;
    private static final int MENU_WORD_SCORE = 1;
    private static final int MENU_SENTENCE_SCORE = 2;
    private static final int MENU_WORD_MAX_MIN = 3;
    private static final int MENU_WORD_SORT = 4;
    private static final int MENU_EXIT = 5;
    //private static String fileName;

    // CLASS VARIABLES
    private static File reviewFile = new File("." + FS + "data" + FS + "movie.review" + FS + "MovieReviews.txt");
    private static File reviewFileTwo = new File("." + FS + "data" + FS + "movie.review" + FS + "negTest.txt");
    private static Scanner input = new Scanner(System.in);

    //This method is the main function that displays the menu and calls different functions that perform
    //various analysis of files with movie reviews
    public static void main(String[] args) throws Exception {
        //VARIABLES & CONSTANTS:
        int num;

        //SPLASH PAGE: Displays the menu for the user
        System.out.println("What would you like you do?");
        System.out.println("1: Get the score of the word");
        System.out.println("2: Get the average score of words in a file");
        System.out.println("3: The highest/lowest scoring words in a file");
        System.out.println("4: Sort words from a file into positive.txt and negative.txt");
        System.out.println("5: Exit the program");

        //INPUT: Asks the user for a number that corresponds to a function that analyzes movie reviews in a certain way
        System.out.println("Enter a number 1-5: ");
        num = Integer.parseInt(input.nextLine());

        //PROCESSING:      
        switch (num) {
            case MENU_WORD_SCORE:
                partOne();
                break;
            case MENU_SENTENCE_SCORE:
                partTwo();
                break;
            case MENU_WORD_MAX_MIN:
                partThree();
                break;
            case MENU_WORD_SORT:
                partFour();
                break;
            case MENU_EXIT:
                break;
            default:
                System.out.println("Invaild Number");
                break;
        }
    }

    //PART ONE: Asks the user to enter a word and then will search every movie review for that word.
    public static void partOne() throws FileNotFoundException {
        //INPUT: Asks the user for a word to see how many times it occurs in the movie review and it's average score.
        System.out.println("Enter a word:");
        String word = input.nextLine().toLowerCase();

        //PROCESSING: Calls the wordReview funtion as it passes the inputed word from the user and uses the results of the called
        //function to find the average score.
        int[] results = wordReview(word);
        double averageScore = (double) results[0] / results[1];

        //OUTPUT: Displays the number of times the inputed word occurs and it's average score.
        System.out.println(word + " appears " + results[1] + " times");
        System.out.println("The average score for reviews containing the word " + word + " is " + averageScore);

    }

    //PART TWO: Asks the user to input the name of a file containing a series of words, one-per-line, and compute 
    //the score of every word in the file.
    public static void partTwo() throws FileNotFoundException {
        //VARIABLES:
        String word, line, review;
        int totalScore = 0;
        int occurance = 0;
        StringTokenizer st;
        int[] values = new int[2];

        //INPUT: Asks the user for a file to analyze it's positivity or negativity.
        System.out.println("Enter the name of the file with words you want to score: ");
        String fileName = input.nextLine();

        //OBJECTS: Reads user input file.
        reviewFileTwo = new File("." + FS + "data" + FS + "movie.review" + FS + fileName);
        Scanner fileInput = new Scanner(reviewFileTwo);

        //PROCESSING: Calculates the average weighted score and if the score is greater than 2.2, the overall review is positive
        //and if the score is less than 1.8, the overall review is negative. Anything in between is neutral.
        while (fileInput.hasNextLine()) {
            line = fileInput.nextLine().toLowerCase();
            st = new StringTokenizer(line);
            word = st.nextToken();
            values = wordReview(word);
            totalScore = totalScore + values[0];
            occurance = occurance + values[1];
        }

        values[0] = totalScore;
        values[1] = occurance;

        double averageScore = (double) values[0] / values[1];
        if (averageScore > 2.2) {
            review = "positive";
        } else if (averageScore < 1.8) {
            review = "negative";
        } else {
            review = "neutral";
        }

        //OUTPUT: This prints the average score for the words in the user's inputed file and prints the overall sentiment.
        System.out.println("The average score for words in " + fileName + " is " + averageScore);
        System.out.println("The overall sentiment is " + review);
    }

    //PART THREE: Asks the user to input the name of a file containing a series of words, one-per-line, 
    //and compute the score of every word in the file. 
    public static void partThree() throws FileNotFoundException {
        //VARIABLES:
        String word;
        String maxWord = "";
        String minWord = "";
        double minScore = 6.0;
        double maxScore = -1.0;

        //INPUT: Asks the user for file name.
        System.out.println("Enter the name of the file with words you want to score: ");
        String fileName = input.nextLine();

        //OBJECTS: Reads user input file.
        reviewFileTwo = new File("." + FS + "data" + FS + "movie.review" + FS + fileName);
        Scanner fileInput = new Scanner(reviewFileTwo);

        //PROCESSING: Searches through words in the file to find min and max scores using the called function, wordReview.
        while (fileInput.hasNextLine()) {
            word = fileInput.nextLine();
            int[] results = wordReview(word);
            double averageScore = (double) results[0] / results[1];

            if (averageScore > maxScore) {
                maxScore = averageScore;
                maxWord = word;
            }
            if (averageScore < minScore) {
                minScore = averageScore;
                minWord = word;
            }
        }

        //OUTPUT: This displays the word with the max score and the word with the min socre.
        System.out.println("The most postive word, with the score of " + maxScore + " is " + maxWord);
        System.out.println("The most negative word, with the score of " + minScore + " is " + minWord);
    }

    //PART FOUR: Asks the user to enter a word file, but instead of reporting 
    //the best and the worst word, two files called positive.txt and negative.txt are created,words 
    //that have scores below 1.8 are put into negative.txt, and words that have scores above 2.2 into positive.txt.
    public static void partFour() throws FileNotFoundException, IOException {
        //VARIABLES:
        String word;

        //INPUT: Asks the user for file input to sort in positive and negative word files.
        System.out.println("Enter the name of the file with words you want to score: ");
        String fileName = input.nextLine();

        //OBJECTS: Reads user input file.
        reviewFileTwo = new File("." + FS + "data" + FS + "movie.review" + FS + fileName);
        Scanner fileInput = new Scanner(reviewFileTwo);

        //PROCESSING: Sorts through positive and negative words from a file and puts them in their respected text files.
        while (fileInput.hasNextLine()) {
            word = fileInput.nextLine();
            int[] results = wordReview(word);
            double averageScore = (double) results[0] / results[1];

            if (averageScore > 2.2) {
                FileWriter fr = new FileWriter("positive", true);
                fr.write(word + " ");
                fr.close();
            }
            if (averageScore < 1.8) {
                FileWriter fr = new FileWriter("negative", true);
                fr.write(word + " ");
                fr.close();
            }
        }
        System.out.println("Check in your repository for positive.txt and negative.txt");
    }

    //This method function counts the occurances of words in the movie review text file and returns the corresponding 
    //score for that word.
    public static int[] wordReview(String word) throws FileNotFoundException {
        //VARIABLES:
        int[] results = new int[2];
        int counter = 0;
        int sum = 0;
        int score;
        double averageScore;
        String line, review;
        StringTokenizer st;

        //OBJECTS: Reads file
        Scanner fileInput = new Scanner(reviewFile);

        //PROCESSING: Counts word occurance and returns score.
        while (fileInput.hasNextLine()) {
            line = fileInput.nextLine().toLowerCase();
            st = new StringTokenizer(line);
            score = Integer.parseInt(st.nextToken());
            if (line.contains(" " + word + " ")) {
                counter++;
                sum = sum + score;
            }
        }

        results[0] = sum;
        results[1] = counter;

        return results;

    }

}
