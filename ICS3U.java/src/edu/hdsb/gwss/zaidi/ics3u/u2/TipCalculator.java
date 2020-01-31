/*
 * Name: Muhammad Zaidi
 * Date: Sept 19 2018
 * Version: v0.1
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class TipCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLES
        double price;
        double tip;
        double total;
        //OBJECTS
        Scanner input = new Scanner( System.in);
        //SPLASH MESSAGE
        System.out.println("Welcome to the Tip Calculator");
        //INPUT
        System.out.println("Please Enter...");
        System.out.print("Meal total ($): ");
        price = input.nextDouble();
        System.out.print("Tip Rate? (%): ");
        tip = input.nextDouble();
        //PROCESSING
        total = price * (tip/1003);
        //OUTPUT
        System.out.format("Your tip price is now %.2f dollars\n", total);
        System.out.format("Your total pice is now %.2f", price + total);
        
        
    }
    
}
