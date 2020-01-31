/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final double discount = 0.1;
        //VARIABLE
        double price;
        double discountedprice;
        //OBJECT
        Scanner input = new Scanner( System.in);
        NumberFormat money = NumberFormat.getCurrencyInstance();
        //SPLASH MESSAGE
        System.out.println("Welcome to the Discount Calculator!");
        //INPUT
        System.out.println("Please Enter...");
        System.out.print("Price ($): ");
        price = input.nextDouble();
        //PROCESSING
        discountedprice = price * discount;
        if (price >= 10) {
            System.out.println (money.format(price - discountedprice));
        } 
        else {
        System.out.println("Your price in $ is: " + money.format(price));
       
    }
    }
}
