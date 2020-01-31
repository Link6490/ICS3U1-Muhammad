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
public class OrderChecker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final double BOLT_PRICE = 0.05;
        final double NUT_PRICE = 0.03;
        final double WASHER_PRICE = 0.01;
        //VARIABLE
        double price;
        double nuts;
        double bolts;
        double washers;
        //OBJECT
        NumberFormat money = NumberFormat.getCurrencyInstance();
        Scanner input = new Scanner( System.in);
        //SPLASH MESSAGE
        System.out.println("Will calculate order of nuts bolts and washers!");
        //INPUT
        System.out.println("Enter how many: ");
        System.out.print("Nuts: ");
        nuts = input.nextDouble();
        System.out.print("Bolts: ");
        bolts = input.nextDouble();
        System.out.print("Wahsers: ");
        washers = input.nextDouble();
        //PROCESSING
        if (nuts < bolts) {
            System.out.println("Check Order: Too Few Nuts");
        } else if (washers < bolts * 2) {
            System.out.println("Check the Order: Too Few Washers");
       
        } else {
             System.out.println("Bolts: " + bolts);
             System.out.println("Nuts: " + nuts);
             System.out.println("Wahers: " + washers);
             price = (bolts * BOLT_PRICE) + (nuts * NUT_PRICE) + (washers * WASHER_PRICE);
             System.out.println("Your price is: " + money.format(price));  
               }
        //OUTPUT
    }
    
}
