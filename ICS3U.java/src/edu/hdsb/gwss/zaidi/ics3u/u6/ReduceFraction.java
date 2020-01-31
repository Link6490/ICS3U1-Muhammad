////
// * Name: Muhammad Zaidi
// * Date: November 30, 2018
// * Version: v0.01
// * Description: Reduce a fraction to it's most simplified for
////
package edu.hdsb.gwss.zaidi.ics3u.u6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author 1zaidisye
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ReduceInput.txt");
        Scanner input = new Scanner(file);
        StringTokenizer st;
        File Outfile = new File("ReduceOutput.txt");
        PrintWriter output = new PrintWriter(Outfile);

        String fraction;
        int numerator;
        int denominator;
        String number;
        int gcd;
        while (input.hasNext()) { //While there are still fractions in the file
            fraction = input.nextLine();
            st = new StringTokenizer(fraction, "/"); //Splitting fractions into seperate numerators and denominators
            numerator = Integer.parseInt(st.nextToken());
            denominator = Integer.parseInt(st.nextToken());
            gcd = gcd(numerator, denominator);

            // NEGATIVE
            numerator = numerator / gcd; //Dividing numerator by GCD
            denominator = denominator / gcd; //Dividing denominator by GCD

            if (numerator == 0 || denominator == 1) { //If denominator is 1 or numerator is 0, it will print the numerator
                System.out.println(numerator);
                output.println(numerator);
            } else if (denominator == 0) { // If numerator is 0, it will print undefined
                System.out.println("Undefined");
                output.println("undefined");
            } else if (denominator < 0 && numerator < 0) { //if both are negatives
                bothNegative(numerator, denominator);
            } else if (numerator < 0 && denominator > 0) { //if it has a negative
                oneNegative(numerator,denominator);
            } else if (numerator > 0 && denominator < 0) { //if it has a negative
                oneNegative(numerator,denominator);
                
            } else if (numerator == 0 && denominator == 0) {
                System.out.println("Undefined");
                output.println("Undefined");
            } else {
                System.out.println(numerator + "/" + denominator);
                output.println(numerator + "/" + denominator);
            }

        }
output.close();
    }

    public static int gcd(int numerator, int denominator) { //Method for finding a gce of a number
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        if (denominator == 0) {
            return numerator;
        }
        return gcd(denominator, numerator % denominator);
    }

    public static void bothNegative(int numerator, int denominator) { //Method, if both numerator and denominator are a negative
        final int MINUS = -1;
        numerator = numerator * MINUS;
        denominator = denominator * MINUS;
        if (numerator == denominator) {
            System.out.println(numerator);
            
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }
    public static void oneNegative(int numerator, int denominator) { //Method if only one of numerator or denominator is a negative
        final int MINUS = -1;
        if (numerator < 0 && denominator > 0 && Math.abs(numerator) != Math.abs(denominator)) {
            System.out.println(numerator + "/" + denominator);
        } else if (numerator < 0 && denominator > 0 && Math.abs(numerator) == Math.abs(denominator)) {
            System.out.println(numerator);
        } else if (numerator > 0 && denominator < 0 && Math.abs(numerator) != Math.abs(denominator)) {
            numerator = numerator * MINUS;
            denominator = denominator * MINUS;
            System.out.println(numerator + "/" + denominator);
        }  else if (numerator > 0 && denominator < 0 && Math.abs(numerator) == Math.abs(denominator)) {
            numerator = numerator * MINUS;
            System.out.println(numerator);
        }
        

}
    
  
}
