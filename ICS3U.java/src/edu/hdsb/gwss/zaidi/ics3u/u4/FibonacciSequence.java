/*
 * Name: Muhammad Zaidi
 * Date: October 19, 2018
 * Version: v0.01
 * Description: 
 * List first 20 terms of Fibonacci series
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

/**
 *
 * @author smaza
 */
public class FibonacciSequence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLE
        int a = 1;
        int b = 1;
        int c;
        //OBJECT
        //SPLASH MESSAGE
        System.out.println("Fibonacci Series\n"
                + "This program will print the first twenty terms of the Fibonacci Series.");
        //INPUT
        //PROCESSING
        System.out.print(a + ", ");
        System.out.print(b + " ");
        for (int num = 2; num < 20; num++) {
            c = a + b;
            System.out.print(", " + c + " ");
            a = b;
            b = c;
        }
        //OUTPUT
    }

}
