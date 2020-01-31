/*
 * Name: Muhammad Zaidi
 * Date: October 5, 2018
 * Version: v0.01
 * Description: 
 * Displays weather the water is acidic, neutral or basic
 */
package edu.hdsb.gwss.zaidi.ics3u.u3;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class AcidRain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        final double MIN_ACID = 0;
        final double MAX_ACID = 6.5;
        final double MIN_NEUTRAL = 6.6;
        final double MAX_NEUTRAL = 7.4;
        final double MIN_BASE = 7.5;
        final double MAX_BASE = 14;
        //VARIABLE
        double waterPh;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Acid rain is an environmental problem.  This program determines if the pH level in water is safe for fish.");
        //INPUT
        System.out.print("Enter the pH level of the water: "); //Asks ph value, so its Acidity can be determined later
        waterPh = input.nextDouble();
        //PROCESSING
        if (waterPh >= MIN_NEUTRAL && waterPh <= MAX_NEUTRAL) {
            System.out.println("NEUTRAL - FISH IN STREAMS, RIVERS AND LAKES WILL SURVIVE.");
        } else {
            if (waterPh >= MIN_ACID && waterPh <= MAX_ACID) {
                System.out.println("TOO ACIDIC - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            }
            if (waterPh >= MIN_BASE && waterPh <= MAX_BASE) {
                System.out.println("TOO ALKALINE - FISH IN STREAMS, RIVERS AND LAKES WILL NOT SURVIVE.");
            }

            if (waterPh < MIN_ACID || waterPh > MAX_BASE) {
                System.out.println("ERROR, Enter a number on the pH Scale!");

            }
        }

    }

}
