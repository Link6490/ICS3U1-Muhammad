/*
 * Name: Muhammad Zaidi
 * Date: Sept 25 2018
 * Version: v0.1
 * Purpose: To calculate volume and surface area of a square based pyramid
 */
package edu.hdsb.gwss.zaidi.ics3u.u2;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //CONSTANT
        //VARIABLE
        double BaseEdge;  //Setting the following variables as doubles becuase they may or may not include decimals
        double Volume;
        double Height;
        double SArea;
        //OBJECT
        Scanner input = new Scanner( System.in); //Utility class that can get the user to input something and set that as a value
        //SPLASH MESSAGE
        System.out.println("Welcome to this program! You can calculate the volume and surface area of a Square Based Pyramid!");
        //INPUT
        System.out.println("Please enter: "); //Asking the user for input and sets the variables to the number the user typed.
        System.out.print("Base Edge(cm): ");
        BaseEdge = input.nextDouble();
        System.out.print("Height(cm): ");
        Height = input.nextDouble();
        System.out.println("So the height of the pyramid in cm is: " + Height);
        System.out.println("and the Base Edge in cm is: " + BaseEdge);
        //PROCESSING
        Volume = Math.pow(BaseEdge, 2) * (Height/3); //Calculating the volume of a square pyramid using math.pow which squares the variable.
        SArea = Math.pow(BaseEdge, 2) + (2 * BaseEdge) * Math.sqrt((Math.pow(BaseEdge, 2)/4) + Math.pow(Height, 2));
        //Calculating the surface area of the pyramid using the formula. Includes Math.sqrt which takes the square root of the variable.
        //OUTPUT
        System.out.println("Your volume in cm cubed is: " + Volume);  //Printing out volume
        System.out.printf("and your surface area in cm squared is: %5.2f\n", SArea);  //Printing out Surface Area
    
    }
    
}
