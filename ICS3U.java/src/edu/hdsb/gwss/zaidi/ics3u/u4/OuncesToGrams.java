/*
 * Name: Muhammad Zaidi
 * Date: October 18, 2018
 * Version: v0.01
 * Description: 
 * Converts ounces to grams
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class OuncesToGrams {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //CONSTANT
      final double CONVERSION = 28.35;
      //VARIABLE
      double grams;
      double ounces = 1;
      //OBJECT
      
      //SPLASH MESSAGE 
        System.out.println("Ounce to Grams Conversion Chart\n" +
"\n" +
"This program will print out a titled table that can be used to convert ounces to grams, for values from 1 to 15. (1 ounce = 28.35 grams) Ounces Grams");
      //INPUT
        
      //PROCESSING
      for (;ounces <= 15; ounces++) {
          grams = ounces * CONVERSION; //conversion rate
          System.out.format("%-5s %.2f \n", ounces, grams);
      }
      //OUTPUT
    }
    
}
