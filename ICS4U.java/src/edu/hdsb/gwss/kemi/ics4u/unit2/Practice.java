/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

/**
 *
 * @author kemij
 */


    /**
     * @param args the command line arguments
     */
   import java.util.ArrayList;


public class Practice {
  public static void main(String [] args) {
    //This program will use a dynamic arrays
    ArrayList<String> nouns = new ArrayList<String>();
    nouns.add("cat");
    nouns.add("dog");
    nouns.add("horse");
    nouns.add("goat");
    nouns.add("eagle");
    nouns.add("lion");
    nouns.add("giraffe");

    ArrayList<String> verbs = new ArrayList<String>();
    verbs.add("ate");
    verbs.add("slept");
    verbs.add("jumped");
    verbs.add("raced");
    verbs.add("ran");
    verbs.add("tripped");
    verbs.add("guessed");
    verbs.add("tapped");

    ArrayList<String> rhymingNouns = new ArrayList<String>();
    rhymingNouns.add("mouse");
    rhymingNouns.add("blouse");
    rhymingNouns.add("grouse");
    rhymingNouns.add("house");
    rhymingNouns.add("spouse");
    rhymingNouns.add("doghouse");
    rhymingNouns.add("beachhouse");
    rhymingNouns.add("treehouse");

    String noun;
    String verb1, verb2;
    String rhymingNoun1, rhymingNoun2;
    int randomNum;

    //get a random noun from the nouns array
    //use .size() to get the # of elements
    randomNum = (int) (Math.random() * nouns.size());
    noun = nouns.get(randomNum);

    //get the first random verb from the verbs array &
    // remove from ArrayList
    randomNum = (int) (Math.random() * verbs.size());
    verb1 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the second random verb from verbs array and remove it
    randomNum = (int) (Math.random() * verbs.size());
    verb2 = verbs.get(randomNum);
    verbs.remove(randomNum);

    //get the first rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun1 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //get the second rhyming noun and remove it
    randomNum = (int) (Math.random() * rhymingNouns.size());
    rhymingNoun2 = rhymingNouns.get(randomNum);
    rhymingNouns.remove(randomNum);

    //Display the poem
    System.out.println("The " + noun + " " + verb1 + " a " + 
      rhymingNoun1 + "\n" + "And then " + verb2 + 
      " it in the " + rhymingNoun2);
  }
}


