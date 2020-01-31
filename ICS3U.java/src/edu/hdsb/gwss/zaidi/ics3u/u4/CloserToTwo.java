/*
 * Name: Muhammad Zaidi
 * Date: October 19, 2018
 * Version: v0.01
 * Description: 
 * Closer to Two
 */
package edu.hdsb.gwss.zaidi.ics3u.u4;

/**
 *
 * @author 1zaidisye
 */
public class CloserToTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLE
        double sum = 0;
        long fraction = 1;
        //OBJECT
        //SPLASH MESSAGE
        System.out.println("Closer to Two\n"
                + " \n"
                + "This program demonstrates that the result of adding the numbers 1, 1/2, 1/4, 1/16, ... \n"
                + "and so on gets closer to 2 without becoming 2.");
        //INPUT
        //PROCESSING
        do {
            System.out.print(sum + " + 1/ " + fraction + " = "); //will print most amount of numbers you could add before it gets to 2
            sum = sum + 1.0 / fraction;
            System.out.println(sum);
            fraction = fraction * 2;

        } while (sum < 2);
        //OUTPUT
    }

}
