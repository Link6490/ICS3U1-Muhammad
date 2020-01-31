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
public class CelciusToFarenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANT
        //VARIABLE
        double celsius; 
        double fahrenheit;     
        //OBJECTS
        //SPLASH MESSAGE
        System.out.println("--------------------------------------------------------");
        System.out.println("In this program, you will convert celsius to fahrenheit ");
        System.out.println("--------------------------------------------------------");
        //INPUT
        celsius = 32;
        //PROCESSING
         fahrenheit = celsius * 9/5 + 32;
        //OUTPUT
        System.out.format("For a temperature of %.2f celsius", celsius);
        System.out.format("The temperature in fahrenheit is %.2f degrees", fahrenheit);
    
    
    
    
    
    
    }
    
}
