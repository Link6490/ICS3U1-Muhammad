/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.zaidi.ics3u.u5;

import java.util.Scanner;

/**
 *
 * @author 1zaidisye
 */
public class Compass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //CONSTANTS
        //VARIABLES
        String degrees;
        String direction;
        String total;
        String directionTwo = null;
        //OBJECT
        Scanner input = new Scanner(System.in);
        //SPLASH MESSAGE
        System.out.println("Compass directions are written in the following form: S45W.  This indicates that the direction is determined by facing SOUTH and then turning 45 degrees towards the WEST.  This program has the user enter a compass direction and then prints a message.");
        //INPUT
         System.out.print("Enter Your direction: ");
        total = input.nextLine();
        //PROCESSING
        if (total.charAt(0) == 'S') {
            direction = "South";
            System.out.print("You have to turn " + direction);
        } else if (total.charAt(0) == 'N') {
            direction = "North";
            System.out.println("You have to turn " + direction);

        } 
        degrees = total.substring(1,3);
        System.out.println(" And then turn " + degrees + " degrees ");
        
        if (total.charAt(3) == 'E') {
            directionTwo = "East";
            System.out.println(directionTwo);
        } else {
            directionTwo = "West";
            System.out.println(directionTwo);
        };
    
    }

}
