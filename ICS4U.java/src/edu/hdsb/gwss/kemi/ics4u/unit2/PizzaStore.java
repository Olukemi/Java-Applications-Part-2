/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.kemi.ics4u.unit2;

/**
 *
 * @author 4UKemi
 */
public class PizzaStore {
    /**
     * @param args the command line arguments
     */
    
    private String toppings;
    private String beverages;
    private String size;
    private double price;
    private boolean delivery; 

    
    public static void main(String[] args) {
       
        PizzaStore ps = new PizzaStore();
        ps.beverages = "water";
        
        System.out.println(ps.beverages);
            
    }
    
}
