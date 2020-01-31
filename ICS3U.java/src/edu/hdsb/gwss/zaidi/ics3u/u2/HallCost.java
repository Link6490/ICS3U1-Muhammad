/*
 * Name: Muhammad Zaidi
 * Date: Sept 19 2018
 * Version: v0.1
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class HallCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
         //CONSTANT
    double rental;
    //VARIABLE
    double guests;
    String name;
    double cost;
    double total_cost;
    double final_cost;
    //OBJECT
    Scanner input = new Scanner( System.in);
    NumberFormat money = NumberFormat.getCurrencyInstance();
    //SPLASH MESSAGE
    System.out.println("Welcome to the hall cost calculator");
    
    //INPUT
    rental = 350;
    System.out.println("Enter...");
    System.out.print("Your name: ");
    name = input.nextLine();
    System.out.print("The number of guests: ");
    guests = input.nextDouble();
    System.out.print("The cost: ");
    cost = input.nextDouble();
    //PROCESSING
    total_cost = rental + cost;
    final_cost = total_cost * guests;
    //OUTPUT
        System.out.println("Hi");
        System.out.println(name);
        System.out.println("The price for one person is " + total_cost);
        System.out.println("The price ($) for everyone in total is " + final_cost);
    }
   
    
}




