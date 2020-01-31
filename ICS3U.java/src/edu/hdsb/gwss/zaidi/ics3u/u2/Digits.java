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
public class Digits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //CONTANTS
            
            //VARIABLES
            int digits;
            int hundreds;
            int tens;
            int ones;
            
            //OBJECTS
            //SPLASH MESSAGE
            System.out.println("This program will calculate how many hundreds, tens and ones are in your number");
            //INPUT
            digits = 324;
            //PROCESSING
            hundreds = digits/100;
            digits = digits%100;
                System.out.println("Hundreds: " + hundreds);
            tens = digits/10;
            digits = digits%10;
                System.out.println("Tens: " + tens );
            ones = digits/1;
            digits = digits%1;
                System.out.println("Ones: " + ones);
                    
            //OUTPUT
            
            
    }
    
}
