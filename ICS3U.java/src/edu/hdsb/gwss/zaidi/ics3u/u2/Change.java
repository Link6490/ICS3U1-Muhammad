/*
 * Name: Muhammad Zaidi
 * Date: Sept 19 2018
 * Version: v0.1
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

/**
 *
 * @author 1zaidisye
 */
public class Change {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    //CONSTANT
    //VARIABLES
    int cents;
    int nickels;
    int quarters;
    int dimes;
    int pennies;
    
    //OBJECTS
    //SPLASH MESSAGE
        System.out.println("Welcome to the Change Calculator!");
    //INPUT
    cents = 212;
        System.out.println("cents:" + cents);
   
    quarters = cents / 25;
        System.out.println("Quarters: " + quarters);
    cents = cents - quarters * 25;
    dimes = cents / 10;
        System.out.println("Dimes: " + dimes);
    cents = cents - dimes * 10;   
    nickels = 0;
        System.out.println("Dimes: 0");
    pennies = cents / 1;
        System.out.println("Penies: " + pennies);
    //PROCESSING    
//OUTPUT
    
        
    }
    
}
